import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationValidation
{	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to User Registration Program");

		UserRegistrationValidation obj = new UserRegistrationValidation();
		
		boolean bool = true;
		
		while(bool)
		{
			obj.validateFirstName();
			bool = false;
		}
		
	}
	public void validateFirstName()
	{
		System.out.println("Enter First Name: ");

		String first_name = scan.nextLine();
		
		String regex = "[A-Z][a-zA-Z][a-zA-Z]+";
		
		boolean result =Pattern.matches(regex, first_name);
		
		if(result)
			{	
			System.out.println("First Name is Valid");
			validateLastName();
			}
		else
			validateFirstName();
	}

	public void validateLastName()
	{
		System.out.println("Enter Last Name: ");
		String last_name = scan.nextLine();
		
		String regex = "[A-Z][a-zA-Z][a-zA-Z]+";
		
		boolean result = Pattern.matches(regex, last_name);
		
		boolean bool = true;
		
		if(result)
		{
			System.out.println("Last Name is Valid");
			validateEmail();
		}
		else
			validateLastName();
	}

	public void validateEmail()
	{
		System.out.println("Enter Email: ");
		String email = scan.nextLine();
		
		String regex = "[a-zA-Z0-9]+[[._+-][a-zA-Z0-9]]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?";
		
		boolean result = Pattern.matches(regex, email);
		
		if(result)
		{
			System.out.println("Email is Valid");
			validateMobileNumber();
		}
		else
			validateEmail();
	}
	public void validateMobileNumber()
	{
		System.out.println("Enter Mobile Number: ");
		String mobile_number = scan.nextLine();
		
		String regex = "\\d{2,3}\\s\\d{10}";
		
		boolean result = Pattern.matches(regex, mobile_number);
		
		if(result)
		{
			System.out.println("Mobile Number is Valid");
			validatePassword();
		}
		else
			validateMobileNumber();
	}

	public void validatePassword()
	{
		System.out.println("Enter Password: ");
		String password = scan.nextLine();
		
		String regex = ".{8,}";
		
		boolean result = Pattern.matches(regex, password);
		
		if(result)
		{
			System.out.println("Valid Password");	
			System.out.println("All fields are Valid");
		}
		else
			validatePassword();
	}
}
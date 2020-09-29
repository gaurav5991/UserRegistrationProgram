import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationValidation
{	
	public static void main(String[] args)
	{
		System.out.println("Welcome to User Registration Program");

		UserRegistrationValidation obj = new UserRegistrationValidation();
		
		obj.validateFirstName();
		
	}
	public void validateFirstName()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Name: ");

		String first_name = scan.nextLine();
		
		String regex = "[A-Z][a-zA-Z][a-zA-Z]+";
		
		boolean result =Pattern.matches(regex, first_name);
		
		if(result)
			System.out.println("First Name is Valid");
		else
			System.out.println("First Name is Invalid");
	}
}
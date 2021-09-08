package MyPackage;

import java.util.regex.Pattern;

public class UserRegistrationUsingRegex {
	//public String firstName,lastName,email,pNumber,password;
	
	public final String FIRST_NAME_PATTERN1 = "^[A-Z]{1}[a-z]{2,}$";
	public final String LAST_NAME_PATTERN1 = "^[A-Z]{1}[a-z]{2,}$";
	public final String EMAIL_PATTERN1 = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z]*[a-z]*?$";
	public final String PHONE_PATTERN1 = "^[0-9]{2}[0-9]{10}$";
	public final String PASSWORD_PATTERN1 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	public boolean firstNameValidation(String name) {//function for validation first name
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN1);
		if(pattern.matcher(name).matches())
			return true;
		else
		{
			System.out.println("pls enter valid input");
			return false;
		}		
	}
	
	public boolean lastNameValidation(String name) {//function for validation last name
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN1);
		if(pattern.matcher(name).matches())
			return true;
		else
		{
			System.out.println("pls enter valid input");
			return false;
		}		
	}
	
	public boolean emailValidation(String name) {//function for validation EMAIL
		Pattern pattern = Pattern.compile(EMAIL_PATTERN1);
		if(pattern.matcher(name).matches())
			return true;
		else
		{
			System.out.println("pls enter valid input");
			return false;
		}		
	}
	
	public boolean phoneNumberValidation(String name) {//function for validation phone number
		Pattern pattern = Pattern.compile(PHONE_PATTERN1);
		if(pattern.matcher(name).matches())
			return true;
		else
		{
			System.out.println("pls enter valid input");
			return false;
		}		
	}
	

	public boolean passwordValidation(String name) {//function for validation PASSWD
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN1);
		if(pattern.matcher(name).matches())
			return true;
		else
		{
			System.out.println("pls enter valid input");
			return false;
		}		
	}
}

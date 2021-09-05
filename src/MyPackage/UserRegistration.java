package MyPackage;
public class UserRegistration {
	
public String firstName,lastName;
public boolean firstNameValidation(String name) {//function for validation first name
	if(name.length()<3)
	{	System.out.println("name must have atleast 3 characters ");
		return(false);}
	
	if(!(name.charAt(0)>=65 && name.charAt(0)<=90))
		{System.out.println("name should start with capital letter ");
		return false;
		}
	firstName=name;
	return true;
			
	
}

public boolean lastNameValidation(String name) {//function for validation last name
	if(name.length()<3)
	{	System.out.println("name must have atleast 3 characters ");
		return(false);}
	
	if(!(name.charAt(0)>=65 && name.charAt(0)<=90))
		{System.out.println("name should start with capital letter ");
		return false;
		}
	lastName=name;
	return true;
			
}

}

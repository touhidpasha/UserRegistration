package MyPackage;
public class UserRegistration {
	
public String firstName;
public boolean firstNameValidation(String name) {
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

}

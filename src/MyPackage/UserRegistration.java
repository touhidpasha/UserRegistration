package MyPackage;
public class UserRegistration {
	
public String firstName,lastName,email,pNumber;

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

public boolean emailValidation(String email) {//function for validation email address
	String name,vendor,domain;
	name=email.split("@")[0];
	vendor=(email.split("@")[1]).split("\\.")[0];
	domain=(email.split("@")[1]).split("\\.")[1];
	//System.out.println(name+" "+vendor+" "+domain);
	//if(!((name.charAt(0) >=65 && name.charAt(0)<=90) || (name.charAt(0)>=97 && name.charAt(0)<=112)))
	if(!Character.isAlphabetic(name.charAt(0)))//verifiying for start of  special character input
	{System.out.println("should start with alphabet ");
	return false;
	}
	this.email=email;
	return true;

}

public boolean phoneNumberValidation(String num) {//function for validation mobile number
	String countryCode,number;
	countryCode=num.split(" ")[0];
	num=num.split(" ")[1];
	if(num.length()<10)
	{
		System.out.println("invalid phone number");
		return false;
		
	}
	
	pNumber=num;
	return true;
	
}
}

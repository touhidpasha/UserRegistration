package MyPackage;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	UserRegistrationUsingRegex u1=new UserRegistrationUsingRegex();//creating object of regex class
	
	try{System.out.println("Enter your firstName"); ///exception will raise if user enter inappropriae date
	while(!u1.firstNameValidation(sc.nextLine())) {}//function will be called untill user enters correct value
	
	System.out.println("Enter your lastName");
	while(!u1.lastNameValidation(sc.nextLine())) {}
	
	System.out.println("Enter email address");
	while(!u1.emailValidation(sc.nextLine())) {}
	
	System.out.println("Enter phone number");
	while(!u1.phoneNumberValidation(sc.nextLine())) {}
	
	System.out.println("Enter password");
	while(!u1.passwordValidation(sc.nextLine())) {}
	
	}
	catch(Exception e) {
		System.out.println("pls enter valid data");
	}
	
	
	}

}

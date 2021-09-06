package MyPackage;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	UserRegistration u1=new UserRegistration();//creating object
	
	System.out.println("Enter your firstName");
	while(!u1.firstNameValidation(sc.nextLine())) {}
	
	System.out.println("Enter your lastName");
	while(!u1.lastNameValidation(sc.nextLine())) {}
	
	System.out.println("Enter email address");
	while(!u1.emailValidation(sc.nextLine())) {}
	
	System.out.println("Enter phone number");
	while(!u1.phoneNumberValidation(sc.nextLine())) {}
	
	System.out.println("Enter password");
	while(!u1.passwordValidation(sc.nextLine())) {}
	
	
	
	}

}

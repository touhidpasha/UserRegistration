package MyPackage;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	UserRegistration u1=new UserRegistration();
	System.out.println("Enter your firstName");
	while(!u1.firstNameValidation(sc.nextLine())) {}
	
	
	
	}

}

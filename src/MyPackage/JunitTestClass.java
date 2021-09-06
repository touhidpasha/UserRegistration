package MyPackage;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class JunitTestClass {

	@Test
	public void test() {
		UserRegistration u1=new UserRegistration();//creating object
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your firstName");
		assertEquals(u1.firstNameValidation(sc.nextLine()),true);
		
		/*System.out.println("Enter your lastName");
		assertEquals(u1.lastNameValidation(sc.nextLine()),true);
		
		System.out.println("Enter email address");
		assertEquals(u1.emailValidation(sc.nextLine()),true);
		
		System.out.println("Enter phone number");
		assertEquals(u1.phoneNumberValidation(sc.nextLine()),true);
		
		System.out.println("Enter password");
		assertEquals(u1.passwordValidation(sc.nextLine()),true);
		*/
	}

}

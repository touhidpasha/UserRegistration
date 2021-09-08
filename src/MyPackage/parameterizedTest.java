package MyPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class parameterizedTest{
	
	Boolean expectedResult;
	String email;
	UserRegistration u1;
	
	@Before
	   public void initialize() {
	    u1 =new UserRegistration();
	   }
	
	public parameterizedTest(String email,Boolean expectedResult) {
		this.email=email;
		this.expectedResult=expectedResult;
	}
	
	 @Parameterized.Parameters
	   public static Collection email() {
	      return Arrays.asList(new Object[][] {
	         { "abc@gmail.com", true },
	         { "zyz@yahoo.com", false },
	         { "sample.com", true }
	         
	      });
	   }

	@Test
	public void test() {
		assertEquals(expectedResult, u1.emailValidation(email) );
	}

}

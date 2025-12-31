package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test                 // 1. Add TestNG library, 2. import org.testng.annotations.Test; 
    public void demo() {

		System.out.println("Hello");
		System.out.println("commentbyuserY");
		System.out.println("commentbyuserX"); 
		System.out.println("commentbyuserX"); 
		
		System.out.println("1st_Branch_Change_by_UserY");
		System.out.println("1st_Branch_Change_by_UserY");
		System.out.println("1st_Branch_Change_by_UserY");
		
		System.out.println("1st_Branch_Change_by_UserX");
		System.out.println("1st_Branch_Change_by_UserX");
		System.out.println("1st_Branch_Change_by_UserX");
		
		Assert.assertTrue(false);
    }
	
	@AfterSuite                 
    public void beforeSuite() {

		System.out.println("I'm the No. 1, from last");
		
    }
	
	@Parameters({"URL"})							// We are pulling the value of the parameter "URL" defined in the XML file.
	@Test                 
    public void secondTest(String personalLoan) {

		System.out.println("Bye");
		System.out.println(personalLoan);			// The parameter value is coming from the XML file, and is stored in the variable "personalLoan".
													// We have same URL parameter Suit level and Test level. Here Test level will take precedence.
    }
	
	@AfterTest              
    public void lastExecution() {

		System.out.println("I will be executed last");
		
    }

}

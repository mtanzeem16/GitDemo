package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})							// We are pulling the value of the parameter "URL" defined in the XML file.
	@Test                 
    public void webLoginHomeLoan(String urlName) {	// The parameter value is coming from the XML file, and is stored in the variable "urlName".
		
		// Selenium
		System.out.println("webLoginHomeLoan");
		System.out.println(urlName);
		
    }
	
	@Test                 
    public void mobileLoginHomeLoan() {

		// Appium 
		System.out.println("mobileLoginHomeLoan");
		
    }
	
	@Test(dependsOnMethods = {"webLoginHomeLoan"})   // We can also pass multiple methods in this Helper Attribute: EX: @Test(dependsOnMethods = {"webLoginHomeLoan", "mobileLoginHomeLoan"})               
    public void APIloginHomeLoan() {

		// REST API Automation
		System.out.println("APIloginHomeLoan");
		
    }
	
	@Test(enabled = false)      					// By using the TestNG helper Attribute (enabled = false), we can skip the test case.      
    public void weHaveABug() {

		System.out.println("The bug fix is under progress. Hence, skip this test case");
		
    }
	
	@Test(timeOut = 5000)      						// By using the TestNG helper Attribute (timeOut = 5000), we can make the TestNG to wait for defined time (which is more than the ImplicitWait, before it fails.      
    public void timeOutCase() {

		System.out.println("Some test cases may take more time (compared to the pre-define ImplicitWait) to execute, due to which it may fail");
		
    }
	
	
}

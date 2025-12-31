package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
	
	@Parameters({"URL", "APIKey", "UserName"})			// We are pulling the value of the parameter "URL" defined in the XML file.
	@Test                 								// We can have multiple parameters defined Suit level or Test level.
    public void webLoginBikeLoan(String bikeLoan, String akey, String uName) {		
														// The parameter value is coming from the XML file, and is stored in the variable "bikeLoan".
		// Selenium
		System.out.println("webLoginBikeLoan");
		System.out.println(bikeLoan);					// We have same URL parameter Suit level and Test level. Here Test level will take precedence.
		System.out.println(akey);
		System.out.println(uName);
    }
	
	@Test(dataProvider = "getData")         								// We are using the @DataProvider annotation for the method called "getData" and using its data in this method     
    public void mobileLoginBikeLoan(String userName, String password) {		// This whole block will run based on the combinations (rows) in the getData() method

		// Appium 
		System.out.println("mobileLoginBikeLoan");
		System.out.println(userName);
		System.out.println(password);
		
    }
	
	@Test(groups = {"Smoke"})                 
    public void APIloginBikeLoan() {

		// REST API Automation
		System.out.println("APIloginBikeLoan");
		
    }
	
	@BeforeMethod                
    public void beforeEveryMethod() {

		System.out.println("I will be executed BEFORE every method in Day5 class");
		
    }
	
	@AfterMethod                
    public void afterEveryMethod() {

		System.out.println("I will be executed AFTER every method in Day5 class");
		
    }
	
	@BeforeClass                
    public void beforeClass() {

		System.out.println("I will be executed BEFORE executing any method in Day5 class");
		
    }
	
	@AfterClass               
    public void afterClass() {

		System.out.println("I will be executed AFTER executing any method in Day5 class");
		
    }
	
	@DataProvider
	public Object[][] getData() {

		// Lets tests for 3 Users with 3 different scenarios: 1. User with Good credit history, 
		// 2. User with No credit history, and 3. User with FRAUDULENT credit history
		// Each User have two parameters: 1. Username and 2. Password
		// Therefore, the Array will be of 3 * 2
		
		Object[][] data = new Object[3][2];   						// 3 = Rows, 2 = Columns
		
		// 1st Set
		data[0][0] = "firstUserName";
		data[0][1] = "firstUserPassword";
		
		// 2nd Set
		data[1][0] = "secondUserName";
		data[1][1] = "secondUserPassword";
		
		// 3rd Set
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdUserPassword";
		
		return data;
		
    }
	
}

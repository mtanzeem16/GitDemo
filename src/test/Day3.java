package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups = {"Smoke"})                 
    public void webLoginCarLoan() {
		
		// Selenium
		System.out.println("webLoginCarLoan");
		
    }

	@Test                 
    public void mobileSignUpCarLoan() {

		// Appium 
		System.out.println("mobileSignUpCarLoan");
		
    }
	
	@BeforeSuite                 
    public void beforeSuite() {

		System.out.println("I'm the No. 1");
		
    }

	@Test                 
    public void mobileLoginCarLoan() {

		// Appium 
		System.out.println("mobileLoginCarLoan");
		
    }

	@Test                 
    public void mobileLogoutCarLoan() {

		// Appium 
		System.out.println("mobileLogoutCarLoan");
		
    }
	
	@Test                 
    public void APILoginCarLoan() {

		// REST API Automation
		System.out.println("APILoginCarLoan");
		
    }
	
}

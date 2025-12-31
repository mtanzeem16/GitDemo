package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups = {"Smoke"})                 
    public void thirdTest() {

		System.out.println("Good");
		
    }
	
@BeforeTest              
    public void prerequisites() {
	
		System.out.println("I will be executed first");
		
    }

}

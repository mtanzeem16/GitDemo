package test;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;


public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I successfully executed Listeners Success Method");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		// 1. Screenshot, 2. Response, if API is failed
		System.out.println("I Failed a method and executed Listeners Failed Method: " + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
	
	@Override
	public void onStart(ITestContext context) {}
	
	@Override
	public void onFinish(ITestContext context) {}

}

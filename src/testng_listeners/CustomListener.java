package testng_listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter{
	
	
	public void onTestFailure(ITestResult tr){
		//own code
		System.out.println("Fail - "+ tr.getName());
	}
	
	public void onTestSkipped(ITestResult tr){
		//own code
		System.out.println("Skipped - "+ tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr){
		//own code
		System.out.println("Success - "+ tr.getName());
	}
}
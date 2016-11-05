package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1)
	public void login(){
		
		// error = stop the test case
		// error = continue the test case

		System.out.println("Start");
		try{
			Assert.assertEquals("A", "X");
		}catch(Throwable t){
			System.out.println("Error in Assertion");
		}
		
		System.out.println("End");
	}
	
	@Test(priority=2)
	public void adminLogin(){
		
	}
	
	

}

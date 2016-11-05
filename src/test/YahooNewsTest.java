package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	
	@BeforeTest
	public void YahooNews(){
		System.out.println("-- @BeforeTest:   Before executing YahooNews Test");
		// throw new SkipException("Skipping testNews");
	}
	
	@Test
	public void testNews(){
		System.out.println("-- @Test:         Executing YahooNews Test");
		
		// Selenium code
		// Expected Value, Actual Value
		// text is present
		// link is present
		
		// Assert.assertEquals("Bad", "Good");
		System.out.println("Before assertion error");
		try{
		Assert.assertTrue(6>10, "Custom Error Message for assertTrue");
		}catch(Throwable t){
			System.out.println("Caught the error");
			// error
			// code - report the error into the reports
		}
		Assert.assertFalse(8>9, "Custom Error Message for assertFalse");
		System.out.println("After assertion error");
	}

}

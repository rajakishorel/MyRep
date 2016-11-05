package test;

import org.testng.annotations.Test;

public class Testcases {
	
	// Multiple tests -- Same data -- Same dataProvider
	
	@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="testDataProvider")
	public void testA(String username, String password){
		
		System.out.println(username +" -- "+password);
		
	}
	
	@Test(priority=2,dataProviderClass=Data_Provider.class,dataProvider="testDataProvider")
	public void testB(String username, String password, String email){
		
		System.out.println(username +" -- "+password +" -- "+email);
		
	}

}

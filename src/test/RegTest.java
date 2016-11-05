package test;

import org.testng.annotations.Test;

public class RegTest {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="regTestDataProvider")
	public void doRegister(String username, String password, String email){
		
		System.out.println(username +" -- "+password +" -- "+email);
	}


}

package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest_Parameterization {
	
	@Test(dataProvider="registerationData")
	public void testRegister(String username, String password, String email, String city){
		// Selenium Code
		// username
		// password
		// email
		// city
		
		System.out.println("    "+username +" -- "+password +" -- "+email +" -- "+city);
	}
	
	@DataProvider
	public Object[][] registerationData(){
		//rows - number of times test has to be repeated.
		//columns - parameters in data 
		Object[][] data = new Object[3][4];			// Object[rows][columns]
		
		//first row
		data[0][0] = "user1";
		data[0][1] = "pwd1";
		data[0][2] = "email1";
		data[0][3] = "city1";
		
		//second row
		data[1][0] = "user2";
		data[1][1] = "pwd2";
		data[1][2] = "email2";
		data[1][3] = "city2";
		
		//third row
		data[2][0] = "user3";
		data[2][1] = "pwd3";
		data[2][2] = "email3";
		data[2][3] = "city3";
		
		return data;
	}

}

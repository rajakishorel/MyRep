package test;

import org.testng.annotations.Test;

public class Sample {
	
		@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="loginTestDataProvider")
		public void testLogin(String username, String password){
			//Assert.assertEquals("A", "B");
			System.out.println("Login Test");
		}
		
		@Test(priority=2,dependsOnMethods={"testLogin"})
		public void testChangePassword(){
			System.out.println("Password Change Test");
		}
		
		@Test(priority=3,dependsOnMethods={"testLogin","testChangePassword"})
		public void testLogout(){
			System.out.println("Logout Test");
		}

}

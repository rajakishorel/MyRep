package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_of_Executing_Testcases {
	
	@Test(priority=1)
	public void testLogin(){
		Assert.assertEquals("A", "B");
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

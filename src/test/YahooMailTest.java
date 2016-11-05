package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooMailTest {
	
	@BeforeSuite
	public void initializeWebDriver(){
		// Selenium Object - WebDriver
		System.out.println("-- @BeforeSuite:  In the very beginning - initialized webdriver");
	}
	
	@AfterSuite
	public void quiteWebDriver(){
		// destroyed
		System.out.println("-- @AfterSuite:   In the end - destroy webdriver");
	}

	@BeforeTest
	public void openConn() {
		System.out.println("-- @BeforeTest:   Connecting to Database");
	}
	
	@AfterTest
	public void closeConn(){
		System.out.println("-- @AfterTest:    Closing connection");
	}

	@BeforeMethod
	public void openBrowser() {
		System.out.println("-- @BeforeMethod: Opening browser");
	}

	@AfterMethod
	public void closeBrowser(){
		System.out.println("-- @AfterMethod:  Closing browser");
	}

	@Test
	public void testReceiveMail() {
		//some selenium code
		System.out.println("-- @Test:         Test Receiving Email");
	}

	@Test
	public void testSendMail() {
		//some selenium code
		System.out.println("-- @Test:         Test Sending Email");
	}

}



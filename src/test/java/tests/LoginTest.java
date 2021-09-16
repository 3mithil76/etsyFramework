package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.BaseClass;

public class LoginTest extends BaseClass{
	 LoginPage lp;
	
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
	    initialization();
	    lp= new LoginPage();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
	lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
		//driver.findElement(By.id("password")).sendKeys("dsgrgrh");
	}
}

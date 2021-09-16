package pages;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.BaseClass;
import utilities.TestUtil;

public class LoginPage extends BaseClass {
	
	@FindBy (xpath = "//nav[@aria-label='Main navigation']/ul/li[1]")
	public static WebElement signinButton;
	
	@FindBy (name = "email")
	public static WebElement email;
	
	@FindBy (name= "submit_attempt")
	public static WebElement continueButton;
	
	@FindBy (name = "password")
	public static WebElement password;
	
	@FindBy (name = "submit_attempt")
	public static WebElement signInButton;
	
	@FindBy (id= "//div[@data-appears-component-name='Homepage_Vesta_View_WelcomeMessage']")
	public static WebElement welcomeMessage;
	
	//@FindBy (linkText = "Halloween Shop")
	//WebElement menuItem;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void login(String a, String b) throws InterruptedException {
		signinButton.click();
		email.sendKeys(a);
		continueButton.click();
		TestUtil.sendKeys(driver, password, 10, b);
		//Thread.sleep(3000);
		//System.out.println(password.isDisplayed());
		password.sendKeys(b);
		signInButton.click();
		Assert.assertTrue(welcomeMessage.isDisplayed());
		
	}
	
}




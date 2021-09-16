package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.TestUtil;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	

	public BaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream f= new FileInputStream ("C:\\Users\\Mithil\\Documents\\Java Class\\Selenium_Workspace\\MyMavenProject57\\src\\main\\java\\config\\config.properties");
			prop.load(f);		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
		 e.printStackTrace();
			
		} 
		
			
	}
	
	public void initialization() {
		
		String browser = prop.getProperty("browser");
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithil\\Documents\\Java Class\\SeleniumJars\\chromedriver.exe");
			driver= new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mithil\\Documents\\Java Class\\SeleniumJars\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		System.out.println("wait");
		driver.get(prop.getProperty("url"));
		
	}

}

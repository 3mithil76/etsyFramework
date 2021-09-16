package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT =20;
	
	


public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value ){
	
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	
}
	
}

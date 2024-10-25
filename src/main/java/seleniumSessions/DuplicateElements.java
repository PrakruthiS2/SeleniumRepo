package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		By forgotpwd= By.linkText("Forgotten Password");
		ElementUtil eleutil= new ElementUtil(driver);
		try {
			eleutil.doClick(forgotpwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
//	testing purpose
	
	// we can add doclick in elementutil class
	
	//by is a type ref 
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//		
//	}
//	
//	public static void  doClick(By locator)
//	{
//		getElement(locator).click();
//	}
	
	
	

	

}


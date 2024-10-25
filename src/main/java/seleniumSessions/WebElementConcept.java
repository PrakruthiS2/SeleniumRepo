package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1) creating webelement and perform action

//		driver.findElement(By.id("input-email")).sendKeys("prak@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("12345");
//		
		// 2)// reusing webelements once we create when required.
//
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		emailID.sendKeys("rak@gmail.com");
//		pwd.sendKeys("123456");

		// 3) By locators- need not hit the browser everytime, create by locators is
		// equal to creating variables and use it when required.
//
//		By emailId=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		// creating webelement- using find ELE
//	WebElement email_ele=	driver.findElement(emailId);
//	WebElement pwd_ele=	driver.findElement(pwd);
//	
//	email_ele.sendKeys("prak@gmail.com");
//	pwd_ele.sendKeys("12345");

//		//4) by locators+ generic function for get Element		
//		By emailId=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		getElement(emailId).sendKeys("prak@gmail");
//		getElement(pwd).sendKeys("12345");
//		
//	}
//	
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}

		// 5) by locators+ generic function for get Element and sendKEys

//		By emailId=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//	doSendKeys(pwd, "12345");
//	doSendKeys(emailId, "prak@gmail");
//		
//	}
//
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	
//	public static void doSendKeys(By locator,String str)
//	{
//		getElement(locator).sendKeys(str);

		// }
		
		
		//6) utility class all generic functions.  // ElementUTil class
		
		By emailId=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.doSendKeys(pwd, "12345");
		eleutil.doSendKeys(emailId, "prak@gmail.com");
	}

}

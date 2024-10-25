package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//1)
		
		By header=	By.tagName("h2");
		By forgotpwdlink=By.linkText("Forgotten Password");
		By emailid= By.id("input-email");
			
//		String hrefval=driver.findElement(forgotpwdlink).getAttribute("href");
//	//	System.out.println(hrefval);
//		String placeholder=driver.findElement(emailid).getAttribute("placeholder");
	//	System.out.println(placeholder);
		
		
		//****************************************************//
		//how to get value of a written text
//		driver.findElement(emailid).sendKeys("test@gmail");
//		String emailVal=driver.findElement(emailid).getAttribute("value");
	//	System.out.println(emailVal);
		
		
		//2) method in eutil
		ElementUtil eutil= new ElementUtil(driver);
		String p=eutil.dogetAttribute(emailid,"placeholder");
		System.out.println(p);
		
		eutil.getElement(emailid).sendKeys("test@gmail.com");
		String val=eutil.dogetAttribute(emailid,"value");
		System.out.println(val);
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}

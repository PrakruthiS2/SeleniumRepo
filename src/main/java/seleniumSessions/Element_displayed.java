package seleniumSessions;

import org.openqa.selenium.NoSuchElementException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_displayed {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(1000);

		// is displayed always return true, else it throws no such element exception,
		// hence better to avoid
//	boolean flag=	driver.findElement(By.id("input-email")).isDisplayed();
//	System.out.println(flag);
//	

		//By emailID = By.id("input-email12");
		By forgotpwdlink= By.linkText("Forgotten Password");
		// doisDisplayed(emailID);
//checking for single occurence of element
//		if (doisDisplayed(emailID)) {
//			System.out.println("PASS");
//		} else {
//			System.out.println("FAIL");
//		}
//		
		//checking for multiple occurrence of element
//		List<WebElement> elementlist=driver.findElements(forgotpwdlink);
//		if(elementlist.size()==1)
//		{
//			System.out.println("single occurence");
//		}
//		else
//		{
//			System.out.println("element present more than once");
//		}
		
		 doisDisplayed(forgotpwdlink,2);
	}

	public static boolean doisDisplayed(By locator) {

		
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed"+locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed"+locator);
			return false;
		}

	}
	
public static boolean doisDisplayed(By locator,int expectedelecount) {

		
	 int elecount=driver.findElements(locator).size();
	 if(expectedelecount==elecount)
	 {
			System.out.println("element is displayed multiple times"+locator+""+elecount);
			return true; 
	 }
		
	 else
	 {
			System.out.println("element is displyed one time"+locator); 
			return false;
	 }

		
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}

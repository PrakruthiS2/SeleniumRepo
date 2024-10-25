package seleniumSessions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		// driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.get("https://classic.freecrm.com/register/");
		By submitButton = By.id("submitButton");
//
//		boolean f1 = driver.findElement(submitButton).isDisplayed();
//		System.out.println(f1);
//
//		boolean f2 = driver.findElement(submitButton).isEnabled();
//		System.out.println(f2);
//		
//		
//	boolean f3=	driver.findElement(By.name("agreeTerms")).isSelected();
//	System.out.println(f3);
		
		

	//	driver.findElement(submitButton).click();

	//	driver.findElement(By.id("pass")).click();// nothing will happen with no exception

	try {
		driver.findElement(By.id("pass")).sendKeys("Naveen");
	}
	
	catch(Exception e)
	{
		System.out.println("ele not interacting");
		
	}
		// ElementNotInteractableException: element not  interactable
		// ElementNotInteractableException: element not interactable in case of sendKeys
		// on disabled element

	}

}

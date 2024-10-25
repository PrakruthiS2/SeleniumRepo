package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(1000);
		
		By country=By.id("Form_getForm_Country");
		By emp=By.id("Form_getForm_NoOfEmployees");
		
		
//		Select sel_country= new Select(driver.findElement(country));
//		//for fixed values ex: month which wont change
//	//	select.selectByIndex(5);
//		
//	//	sel_country.selectByVisibleText("Australia");
//		sel_country.selectByValue("Bahrain");  // value attribute
		
		doSelectByValue(country,"Bahrain");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSelectByIndex(By locator, int index)
	{
		Select select= new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String val)
	{
		Select select= new Select(getElement(locator));
		select.selectByValue(val);
	}
	public static void doSelectByvisibleText(By locator, String text)
	{
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
}

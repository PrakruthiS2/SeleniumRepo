package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_SendKeysandClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		// driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//normal sendkeys- directly start typing on the webele
		//driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Auto");
		
		By firstname= By.cssSelector("input#input-firstname");
		//actions sendkeys first click and then type
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(firstname),"Auto").perform();
		Thread.sleep(1000);
		act.click(driver.findElement(By.linkText("Forgotten Password"))).perform();
	}

	public static void doActionssendkeys(By locator, String val)
	{
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(locator),val).perform();
	}
	
	public static void doActionsClick(By locator)
	{
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(locator)).perform();
	}
}

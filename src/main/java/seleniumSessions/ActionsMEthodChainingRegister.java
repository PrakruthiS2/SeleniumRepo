package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMEthodChainingRegister {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		Actions act = new Actions(driver);
		act.sendKeys(firstName, "Prax").pause(1000).sendKeys(Keys.TAB).
		sendKeys("destroyer").pause(1000).sendKeys(Keys.TAB).sendKeys("ss@gmail.com").pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys("12345").sendKeys(Keys.TAB).pause(1000).sendKeys("abc@123").
		pause(1000).sendKeys(Keys.TAB).sendKeys("abc@123").sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).pause(1000).build().perform();
//pressing enter or pressing space for selection
	}

}

package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By search = By.name("search");
		String searchkey = "macbook";
		// convert searchkey =macbook(String) to char
//		char ch[] = searchkey.toCharArray();

		//act.sendKeys(driver.findElement(search), charseq).perform();
		//but charseq (I) will take String, Stringbuffer, StringBuilder class
//		Actions act = new Actions(driver);
//		//pass char letter by letter
//		for (char c : ch) {
//			act.sendKeys(driver.findElement(search), String.valueOf(c)).pause(500).perform();
//		}

		doActionsSendkeysWithPause(search,"samsung",500);	
	}
	
	public static void doActionsSendkeysWithPause(By locator, String val,long pauseTime)
	{
		Actions act = new Actions(driver);
		char ch[] = val.toCharArray();
//		//pass char letter by letter
	for (char c : ch) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}

}

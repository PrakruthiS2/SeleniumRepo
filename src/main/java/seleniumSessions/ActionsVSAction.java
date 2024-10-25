package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVSAction {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName = By.id("input-firstname");

		//Actions is a class
		Actions act = new Actions(driver);

		//Action is an interface , build() returns Action interface
		Action action = act.sendKeys(driver.findElement(firstName), "Automation").build();

		action.perform();
	}

}

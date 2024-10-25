package seleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandlingBigBasket {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By level1= By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By level2= By.linkText("Beverages");
		By level3 = By.linkText("Tea");
		By level4 = By.linkText("Green Tea");
	//	level4MenuSubMenuHandlingUsingClick(level1,"Beverages","Tea","Green Tea");
		level4MenuSubMenuHandlingUsingClick("Shop by","Beverages","Tea","Green Tea");
		
	}
	public static void level4MenuSubMenuHandlingUsingClick(By level1, String level2, String level3, String level4)
			throws InterruptedException {		
		driver.findElement(level1).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText(level2))).perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.linkText(level3))).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText(level4)).click();
	}
	
	public static void level4MenuSubMenuHandlingUsingMouseHover(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(level1)).perform();
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(level3)).perform();
		Thread.sleep(1000);
		driver.findElement(level4).click();

	}
	
	
	
	// if end user needs to change their selection, its easier through passing string as parameter.
	
	
	public static  void level4MenuSubMenuHandlingUsingClick(String level1, String level2, String level3, String level4)
			throws InterruptedException {
		
		driver.findElement((By.xpath("//button[contains(@id,'headlessui-menu-button')]//span[text()='"+level1+"'])[2]"))).click();		
	//getElement(By.xpath("//button[contains(@id,'headlessui-menu-button')]//span[text()='"+level1+"'])[2]")).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.linkText(level2))).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(By.linkText(level3))).perform();
		Thread.sleep(1000);
		getElement(By.linkText(level4)).click();
	}
	
	public static WebElement getElement(By locator) {

		try {
			WebElement ele = driver.findElement(locator);
			return ele;
		} catch (NoSuchElementException e) {
			System.out.println("no element found");
			e.printStackTrace();
			return null;
		}

	}

}

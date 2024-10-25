package seleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOrContextClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightclickele = driver.findElement(By.xpath("//span[(text()='right click me')]"));
		Actions act = new Actions(driver);
		/************* rightclick *******/
		act.contextClick(rightclickele).perform();
		/***** clicking on copy ************/
		List<WebElement> rightclickoptions = driver
				.findElements(By.cssSelector("ul.context-menu-list > li.context-menu-icon"));
		for (WebElement e : rightclickoptions) {
			String text = e.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Copy")) {
				e.click();
				break;
			}
		}
		/******* clicking on alert for copy **/
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
	}

}

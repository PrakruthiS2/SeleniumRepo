package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com");
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		

		// driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		// Thread.sleep(3000);
///*******************************xpath***************** is challenging
//		List<WebElement> sugglist = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		System.out.println(sugglist.size());
//
//		for (WebElement e : sugglist) {
//			String text = e.getText();
//			if (text.contains("selenium")) {
//				e.click();
//			}
//		}

		By searchField = By.name("q");
		// By suggestions= By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		By suggestions = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		// driver.findElement(searchField).sendKeys("naveen automationlabs");
		driver.findElement(searchField).sendKeys("macbook");
		Thread.sleep(3000);
		// doSearch(searchField, "naveen automationlabs", suggestions, "selenium");
		doSearch(searchField, "macbook", suggestions,"m3");
	}
	
	
	/*****
	 * @WAF to search and click on specific element in google and flipkart
	 * @param searchField
	 * @param searchKey
	 * @param suggestions
	 * @param value
	 */

	public static void doSearch(By searchField, String searchKey, By suggestions, String value) {
		List<WebElement> sugglist = driver.findElements(suggestions);
		// creasting list of string for adding elements into list
		List<String> suggoptions = new ArrayList<String>();
		System.out.println(sugglist.size());

		for (WebElement e : sugglist) {
			String text = e.getText();
			// for aDDING TEXT INTO NEWLY CREATED LIST.
			suggoptions.add(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

		System.out.println(suggoptions);
	}

}

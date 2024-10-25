package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By images = By.tagName("img");
		By links= By.tagName("a");
		

		getImageAttributeList(images, "src");
		getImageAttributeList(links, "title");
	}

	public static List<WebElement> getListofElements(By locator) {

		return driver.findElements(locator);

	}
	
	//************imp************************
//webscrapping 
	public static void  getImageAttributeList(By locator, String attributename) {
		List<WebElement> imagelist = getListofElements(locator);
		for (WebElement e : imagelist) {
			String attrVal = e.getAttribute(attributename);
			if (attrVal != null  && attrVal.length() != 0) {
				System.out.println(attrVal);
			}  

		}
	}
}

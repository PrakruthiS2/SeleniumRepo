package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////////////////////****************************use findElements--- without selectClass
public class DropdownwithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(1000);

		By countryoptions = By.xpath("//select[@id='Form_getForm_Country']/option");

//		List<WebElement> countryddoptions = driver.findElements(countryoptions);
//		List<String> list = new ArrayList<String>();
//		for (WebElement e : countryddoptions) {
//			String text = e.getText();
//			list.add(text);
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
//		System.out.println(list);
		
		doSelectDDwithoutSelectTag(countryoptions,"India");
	}

	
	
	
	public static List<String> doSelectDDwithoutSelectTag(By locator, String txt)
	{
		List<WebElement> countryddoptions = driver.findElements(locator);
		List<String> list = new ArrayList<String>();
		for (WebElement e : countryddoptions) {
			String text = e.getText();
			list.add(text);
			if (text.equals(txt)) {
				e.click();
				
			}
		}
		return list;
	}
}

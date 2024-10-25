package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);

//		List<WebElement> langlinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		List<String> options = new ArrayList<String>();
//		System.out.println(langlinks.size());
//
//		for (WebElement ele : langlinks) {
//			String text = ele.getText();
//			options.add(text);
//			// if(text.equals("ಕನ್ನಡ"))
//			if (text.equals("Privacy")) {
//				ele.click();
	//	break;
//			}
//		}
//		System.out.println(options);
		

		By langlink = By.xpath("//div[@id='SIvCob']/a");
		By footerlink = By.xpath("//div[@class='KxwPGc SSwjIe']/div/a");
		// doClickGooglePageSectionLink(langlink, "ಕನ್ನಡ");

		doClickGooglePageSectionLink(footerlink, "Privacy");

	}

	/*******
	 * @WAF Clicking on google section link
	 * @param locator
	 * @param val
	 */

	public static void doClickGooglePageSectionLink(By locator, String val) {
		List<WebElement> langlinks = driver.findElements(locator);
		System.out.println(langlinks.size());

		for (WebElement ele : langlinks) {
			String text = ele.getText();
			if (text.equals(val)) {
				ele.click();
				break;
			}
		}
	}

}

package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	// we declare driver as static bcoz we dont need to create obj
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1)
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		String forgotpwdlink= driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(forgotpwdlink);
//		String para= driver.findElement(By.xpath("//*[@id='content']/div/div/div/p[2]")).getText();
//		System.out.println(para);

		// 2) dogetText method in elementUTil

		// creating by locators in caller method

		By header = By.tagName("h2");
		By forgotpwdlink = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id='content']/div/div/div/p[2]");

		ElementUtil eutil = new ElementUtil(driver);

		System.out.println(eutil.doGetText(header));
		System.out.println(eutil.doGetText(forgotpwdlink));
		System.out.println(eutil.doGetText(para));

	}

}

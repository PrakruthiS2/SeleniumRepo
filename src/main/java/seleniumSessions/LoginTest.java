package seleniumSessions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brutil= new BrowserUtil();
	//1st way to user chrome directly
	//	WebDriver driver= brutil.launchBrowser("chrome");
		
		//2nd way call chrome from config.properties file
		ReadProperties read= new ReadProperties();
		Properties prop=read.initProperties();
	WebDriver driver=	brutil.launchBrowser(prop.getProperty("chrome"));
		brutil.getURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		brutil.getTitle();
		By emailId=By.id("input-email");
		By pwd=By.id("input-password");
		
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.doSendKeys(pwd, "12345");
		eleutil.doSendKeys(emailId, "prak@gmail");
		
		brutil.closeBrowser();
	}

}

package seleniumSessions;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCarTest {

	
public static void main(String[] args)
{
	
	//String browserName="chrome";
	
//	test.launchBrowser(browserName);
	
	ReadProperties read= new ReadProperties();
	//from readproperties class called initprop method
	Properties prop=read.initProperties();
	// object of browserutil to call launchbrowser
	BrowserUtil test= new BrowserUtil();
	//using property file for browser
	test.launchBrowser(prop.getProperty("browser"));
	
	test.getURL("https://naveenautomationlabs.com/opencart/");
	String title=test.getTitle();
	if(title.contains("Store"))	
	System.out.println("title is correct");
	else
	System.out.println("title is correct");		
	test.quitBrowser();
}
		// TODO Auto-generated method stub
 
		
	
}

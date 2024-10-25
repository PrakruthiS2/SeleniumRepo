package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {


	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println(browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
		//	WebDriver driver = new FirefoxDriver();
			System.out.println("launching chrome browser");
			break;
		case "edge":
			//driver = new EdgeDriver();
			System.out.println("launching edge browser");
			break;

		default:
			System.out.println("plz pass the right browser");
			// calling our own custom exception class to produce our own error mesg
			throw new BrowserException("BROWSER INVALID EXCEPTION" + browserName);

		}
		// i want to return the driver
		return driver;
	}

	public void getURL(String url) {
		if (url == null) {
			throw new BrowserException("INAVLID URL" + url);
		}

		if (url.isBlank() || url.isEmpty()) {
			throw new BrowserException("EMPTY URL" + url);
		}

		if ((url.indexOf("http") != 0) || url.indexOf("http") > 0) {
			throw new BrowserException("http is missing" + url);
		}
// we return driver bcoz same session id needs to be given to opencsartest class.
		
		driver.get(url.trim());
	}

	public String getTitle() {
		
		String title= driver.getTitle();
		System.out.println(title);
		return title;

	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
	
}

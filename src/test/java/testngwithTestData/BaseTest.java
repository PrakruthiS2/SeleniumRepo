package testngwithTestData;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
// when u use parameter tag in testng and passing value from there
	@Parameters({"browser","url"})
	@BeforeTest
	public void setUp(String browserName, String url) {
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();		
			break;
		case "firefox":
			driver=new FirefoxDriver();		
			break;
		case "edge":
			driver=new EdgeDriver();		
			break;
		default:
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseOCBuyProducts {

	WebDriver driver;
	@Parameters({"browser","url","username","password"})
	@BeforeTest
	public void setup(String browserName, String url, String username, String password)
	{
		switch (browserName) {
		case "chrome":
			driver= new ChromeDriver();			
			break;
		case "edge":
			driver= new EdgeDriver();

		default:
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		By usr= By.id("input-email");
		driver.findElement(usr).sendKeys(username);
		By pwd= By.id("input-password");
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}

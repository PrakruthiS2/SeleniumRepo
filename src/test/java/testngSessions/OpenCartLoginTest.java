package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {

	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	@Test(description="checking login page title")
	public void testLoginPageTitle()
	{
		String title= driver.getTitle();
		System.out.println(title+"title");
		Assert.assertEquals(title, "Account Login","title not matched");

	}
	
	
	
	@Test(description="checking url of the current page")
	public void testURL()
	{
		String url= driver.getCurrentUrl();
		System.out.println("url is"+url);
		Assert.assertTrue(url.contains("route=account/login"));

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}

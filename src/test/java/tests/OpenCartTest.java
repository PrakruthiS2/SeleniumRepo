package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	
	@Test(description = "checking login page title" ,priority =1)
	public void opencartPageTitle() {
		//u can also get link from base test and remove priority
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println(title + "title");
		Assert.assertEquals(title, "Your Store", "title not matched");

	}

	@Test(description = "checking url of the current page", priority =2)
	public void opencarttestURL() {
		String url = driver.getCurrentUrl();
		System.out.println("url is" + url);
		Assert.assertTrue(url.contains("opencart"));

	}
	@Test(description="checking logo on the page",priority=3)
	public void logoTest()
	{
	boolean flag=driver.findElement(By.cssSelector("a img.img-responsive")).isDisplayed();
	Assert.assertEquals(flag, true , "logo is missing");
	}

}

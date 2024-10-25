package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test(description = "checking login page title")
	public void googleTitletest() {
	
		String title = driver.getTitle();
		System.out.println(title + "title");
		Assert.assertEquals(title,"Google", "title not matched");

	}

	@Test(description = "checking url of the current page")
	public void googleURLtest() throws InterruptedException {
	
		String url = driver.getCurrentUrl();
		
		System.out.println("url is" + url);
		Assert.assertTrue(url.contains("google"));

	}

}

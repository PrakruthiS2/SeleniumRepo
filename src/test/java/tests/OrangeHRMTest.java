package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	@Test(description = "checking login page title")
	public void orangeTitletest() {

		String title = driver.getTitle();
		System.out.println(title + "title");
		Assert.assertEquals(title, "OrangeHRM", "title not matched");

	}

	@Test(description = "checking url of the current page")
	public void orangeURLtest() {
		String url = driver.getCurrentUrl();
		System.out.println("url is" + url);
		Assert.assertTrue(url.contains("orange"));

	}

}

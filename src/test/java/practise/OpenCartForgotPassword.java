package practise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartForgotPassword extends BaseOCTest {

	@Test
	public void opencart_forgotpwd_test()
	{
		boolean flag=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).isDisplayed();
		Assert.assertEquals(flag,true);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}
}

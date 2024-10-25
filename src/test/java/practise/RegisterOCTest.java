package practise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterOCTest extends BaseOCTest {
	@Test
	public void checkRegisterlink() {
		boolean flag=driver.findElement(By.xpath("(//a[contains(text(),'Register')])[1]")).isDisplayed();
		Assert.assertEquals(flag,true);
	//	driver.findElement(By.xpath("(//a[contains(text(),'Register')])[1]")).click();
	}
}

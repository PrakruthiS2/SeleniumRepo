package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// first write the base class for the testing classs fill all the details for the setup take parameters from testng use @PArameters and pass it to the existing @before class
public class OpenCartProductsBuy extends BaseOCBuyProducts {


	@DataProvider(name= "dataforOC")
	public Object[][] getTestDataOC()
	{
		return new Object[][] {
				{"pro macbook","MacBookPro","2"},

	};
	}
	
	
	@Test(dataProvider="dataforOC")
	public void addtoCart(String searchkey,String productname,String qnty)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys(searchkey);
		driver.findElement(By.xpath("//span[contains(@class,'input')]/button[@type='button']")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'MacBook Pro')]")).click();	
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys(qnty);
		driver.findElement(By.id("button-cart")).click();
	}
}

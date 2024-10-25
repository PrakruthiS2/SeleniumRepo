package testngwithTestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest
{
	
	
	public String getRandomEmailID(){
		String emailid= "opencart" +System.currentTimeMillis()+"@gmail.com";
		return emailid;
		
		
	
	}
	
	
//no of parameters passing should be equal to no of parameter to hold
	@DataProvider(name="Stringdataprovider")
	public Object[][] getRegisterTestData()
	{
		return new Object[][] {
			{"Kavi", "selenium", "9876543223", "kavi@123"},
			{"Amit", "auto","7876543223", "amit@123"},
			{"Praful", "auto","6876543223", "praful@123"}
		};
	
	}
	
	@Test(dataProvider="Stringdataprovider")
	public void registerPageTest (String firstName,String lastName, String telephone, String password) throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailID());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		Thread.sleep(1000);
	

		driver.findElement(By.name("agree")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}
}
package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetToListWindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		
		//set to list
		Set <String> handles=driver.getWindowHandles();
		List<String> listhandle= new ArrayList<String>(handles);

		String parentId=listhandle.get(0);
		System.out.println(parentId);
		
		String childId=listhandle.get(1);
		driver.switchTo().window(childId);
	
		
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getCurrentUrl());
		
		
		
	}
	

}

package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		String parentId= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
	
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}
}

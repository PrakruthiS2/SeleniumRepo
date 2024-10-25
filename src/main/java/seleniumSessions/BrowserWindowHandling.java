package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // parentwindow ID
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//fetching the windowids		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator(); // iterator methods is used to fetch data from unordered set and at													// the start 'it' point above parentwindow
		String parentwindowId = it.next(); // points to parentWindow now
		System.out.println("Parent window id is:"+parentwindowId);
		String childwindowid= it.next();
		System.out.println("childwindow id is:"+childwindowid);
		
		
		//2)switching work
		driver.switchTo().window(childwindowid);
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.close(); //close the child window
		

		//driver.switchTo().window(parentwindowId);
		//driver.getCurrentUrl();
		//driver.quit(); // close all windows
		
		;
	}

}

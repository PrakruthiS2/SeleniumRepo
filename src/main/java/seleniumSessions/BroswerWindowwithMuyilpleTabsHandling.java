package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BroswerWindowwithMuyilpleTabsHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// capture parentwindow id and keep it
		Thread.sleep(1000);
		// open all child windows by clicking all
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//storing parent id for further comparison with child windows
		String parentId = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		// closes all windows including parent window
//		while(it.hasNext())
//		{
//			String windowid=it.next();
//			driver.switchTo().window(windowid);
//			System.out.println(driver.getCurrentUrl());
//			Thread.sleep(1000);
//			driver.close();
//		}
//		
		//doesnt close parent window
		while(it.hasNext())
		{
			String childid=it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1000);
			if(!parentId.equals(childid))
			{
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

}

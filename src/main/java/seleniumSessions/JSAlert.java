package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// driver.switchTo().alert();//NoAlertPresentException: no such alert
		
		//1)alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();  //ok button
//		alert.dismiss(); //remove the button
		
//		try {
//			alert.dismiss();
//		}
//		catch(NoAlertPresentException e)
//		{
//			System.out.println("Alert not found");
//		}
	

		
		//2) confirmation alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(1000);
//		Alert alert1= driver.switchTo().alert();
//		alert1.dismiss();
		
		
		//3)prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert2= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert2.sendKeys("test");
		alert2.accept();
		
		
		
	}

}

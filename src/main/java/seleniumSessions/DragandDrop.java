package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	WebElement sourcecele=	driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement targetcele=	driver.findElement(By.xpath("//div[@id='droppable']"));
	
	//draganddrop
	//build()composite action
	Actions act= new Actions(driver);
	//act.clickAndHold(sourcecele).moveToElement(targetcele).build().perform();
	
	//or	
	act.dragAndDrop(sourcecele, targetcele).build().perform();
	
	
	}
	
	
	public static void draganddrop(By loc1, By loc2)
	{
		WebElement sourcecele=	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetcele=	driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(sourcecele, targetcele).build().perform();
	//	act.clickAndHold(loc1).moveToElement(loc2).build().perform();		
	}

}

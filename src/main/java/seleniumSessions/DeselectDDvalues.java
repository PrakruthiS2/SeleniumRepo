package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDDvalues {
	static WebDriver	driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WebDriver	driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		Thread.sleep(1000);
		
//		Select sel= new Select(driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select")));
//		if(sel.isMultiple())
//		{
//			sel.selectByVisibleText("American flamingo");
//			sel.selectByVisibleText("Chilean flamingo");
//			sel.selectByIndex(4);
//		}
//		
//		sel.deselectByIndex(0);
		
		By ddmultioptions= By.xpath("//*[@id=\"post-291\"]/div/div[2]/select");
		doMultiselectandDeselect(ddmultioptions,"American flamingo","Chilean flamingo");
	

	}
public static void doMultiselectandDeselect(By locator, String text1 , String text2)
{
	Select sel= new Select(driver.findElement(locator));
	if(sel.isMultiple())
	{
		sel.selectByVisibleText(text2);
		sel.selectByVisibleText(text1);		
	}
	
	sel.deselectByVisibleText(text2);
}
}

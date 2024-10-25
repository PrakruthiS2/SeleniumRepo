package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Actions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com");
		//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		
		//movetoele is a action. build method is used to generate composite action
//		Actions act= new Actions(driver);
//		act.moveToElement(driver.findElement(By.cssSelector("a.menulink"))).build().perform();
//		
//		//courses passed as per text in the webpage
//		driver.findElement(By.linkText("COURSES")).click();

		
		
//		By parentmenu=By.cssSelector("a.menulink");
//		By childmenu=By.linkText("COURSES"); 
//		handleParentSubMenu(parentmenu,childmenu);
//	
		By addons = By.xpath("//div[text()='Add-ons']");
		By spicePlus = By.xpath("//div[text()='SpicePlus']");
		handleParentSubMenu(addons,spicePlus);
		
	}

	
	
	public static void  handleParentSubMenu(By parentloc, By childloc) throws InterruptedException
	{
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(parentloc)).build().perform();
		
		Thread.sleep(3000);
		//courses passed as per text in the webpage
		driver.findElement(childloc).click();
	}
}

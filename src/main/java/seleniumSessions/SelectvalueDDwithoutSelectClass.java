package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectvalueDDwithoutSelectClass {

	static WebDriver driver;
	
	
	// 1) witout select methods selectByindex,value,visible text
	
	//2) without select class tag
	
//1)	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(1000);

		By country = By.id("Form_getForm_Country");
		By emp = By.id("Form_getForm_NoOfEmployees");

		
//		Select selectcountry= new Select(driver.findElement(country));
//		List<WebElement> countrylist=selectcountry.getOptions();
//		
//		System.out.println(countrylist);
//		for(WebElement e: countrylist)
//		{
//			
//			String text=e.getText();
//			if(text.equals("Canada")) {
//				e.click();
//		break;
//			}
//		}
		
	doSelectddOptions(country,"India");	
	
		
	}
	
	public static void doSelectddOptions(By locator, String optionstext)
	{
		Select selectoptions= new Select(driver.findElement(locator));
		List<WebElement> optionslist=selectoptions.getOptions();
		
		for(WebElement e: optionslist)
	{
			
			String text=e.getText();
			if(text.equals(optionstext)) {
				e.click();
		break;
			}
		}
	}
		
	}



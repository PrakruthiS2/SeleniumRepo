package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(1000);

		By country = By.id("Form_getForm_Country");
		By emp = By.id("Form_getForm_NoOfEmployees");

//		Select selectcountry= new Select(driver.findElement(country));
//		List<WebElement> countryoptions=selectcountry.getOptions();
//		System.out.println(countryoptions.size());
//		for(WebElement e : countryoptions)
//		{
//			String text=e.getText();
//			System.out.println(text);
//		}
		getSelectDropdownoptions(country,"India");
	//	System.out.println(getSelectDDCount(emp));

	}

	public static void getSelectDropdownoptions(By locator, String optiontext) {
		Select selectcountry = new Select(driver.findElement(locator));
		List<WebElement> countryoptions = selectcountry.getOptions();
		//System.out.println(countryoptions.size());
		for (WebElement e : countryoptions) {
			String text = e.getText();
		//	System.out.println(text);
			if(text.equals(optiontext))
			{
				e.click();
			}
		}

	}

	public static int getSelectDDCount(By locator)

	{
		Select selectoptions = new Select(driver.findElement(locator));
		List<WebElement> dropdownlist = selectoptions.getOptions();

		return dropdownlist.size();
	}

}

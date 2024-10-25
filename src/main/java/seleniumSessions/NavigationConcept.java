package seleniumSessions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		
		
		driver= new ChromeDriver();
		//get method is not overloaded
		driver.get("https://www.google.com");
		
		// navigate to method is overloaded with String type url and URL type of url
		
		driver.navigate().to("https://www.google.com");
	//	driver.navigate().to(new URL("https://www.google.com"));
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}

package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title= driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase(("google")))
		{
			System.out.println("launching google");
		}
		else
		{
			System.out.println("not launching google");
			
		}
		driver.close();

	}

}

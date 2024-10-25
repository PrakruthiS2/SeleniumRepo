package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

//1)total links and images
//2)get text of each link
//3) text of each element in the list
	
		static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			driver= new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/");
			
//			List <WebElement> linkslist= driver.findElements(By.tagName("a"));
//			System.out.println("total links\t"+linkslist.size());
//			for(int i=0;i<linkslist.size();i++)
//				
//			{
//			String text=linkslist.get(i).getText();
//			if(text.length()!=0)
//			{
//				System.out.println(text);
//				System.out.println(linkslist.size());
//			}
//			
//			else
//			{
//				System.out.println();
//			}
		
		//	}
			
			
			List <WebElement> textList= driver.findElements(By.tagName("a"));
			for(WebElement ele: textList)
			{
				
				String str =ele.getText();
				System.out.println(str);
			}
			

			By links=By.tagName("a");
			By images= By.tagName("img");
			
			//getListofElements(links);
			//System.out.println("totalimages:"+ getElementsCount(images));	
			//totalimages	
			
		//	System.out.println("text of list of links"+getElementsLinkText(links));
			List<String> textlist=getElementsLinkText(links);
			System.out.println(textlist.contains("Desktops"));
			
			
		}	
		
		//creating utility methods for getting text of list
		
	public static List<WebElement> getListofElements(By locator) {
		
		return driver.findElements(locator);
		
	}
	
	public static int getElementsCount(By locator)
	{
		return getListofElements(locator).size();
		
		
	}
	
	/***********
	 * WAF: to fetch the text of each link, store it in some list and return the text. text should not be blank
	 * @name getElemtsLinkText
	 * @param By locator
	 * @return List<String>
	 */
	
	public static List<String> getElementsLinkText(By locator)
	{
		List <WebElement> list= driver.findElements(locator);
		List <String> textlist= new ArrayList();
		for(WebElement e: list)
		{
			String str=e.getText();
			if(str.length()!=0)
			{
				textlist.add(str);
			}			
		}		
		return textlist;
	}
	
}



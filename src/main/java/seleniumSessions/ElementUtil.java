package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;

	// plz pass same driver from paramter to class driver. so it maintains asme
	// session id of the driver or same driver is passed from the previous session
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {

		try {
			WebElement ele = driver.findElement(locator);
			return ele;
		} catch (NoSuchElementException e) {
			System.out.println("no element found");
			e.printStackTrace();
			return null;
		}

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendKeys(By locator, String val) {
		nullCheck(val);
		getElement(locator).sendKeys(val);

	}

	// private access via public layer-- encapsulation... nullcheck used through
	// dosendkeys

	private void nullCheck(String val) {
		if (val == null) {
			throw new ElementException("Value is NUll" + val);
		}
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String dogetAttribute(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);
	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<String> getElementsLinkText(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> textlist = new ArrayList();
		for (WebElement e : list) {
			String str = e.getText();
			if (str.length() != 0) {
				textlist.add(str);
			}
		}
		return textlist;
	}

	// *****dropdown******

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByValue(By locator, String val) {
		Select select = new Select(getElement(locator));
		select.selectByValue(val);
	}

	public void doSelectByvisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectddOptions(By locator, String optionstext) {
		Select selectoptions = new Select(getElement(locator));
		List<WebElement> optionslist = selectoptions.getOptions();

		for (WebElement e : optionslist) {

			String text = e.getText();
			if (text.equals(optionstext)) {
				e.click();
				break;
			}
		}
	}

	public void doSelectDDwithoutSelectTag(By locator, String txt) {
		List<WebElement> countryddoptions = getElements(locator);

		for (WebElement e : countryddoptions) {
			String text = e.getText();
			if (text.equals(txt)) {
				e.click();

			}
		}

	}

	public void getSelectDropdownoptions(By locator, String optiontext) {
		Select selectcountry = new Select(getElement(locator));
		List<WebElement> countryoptions = selectcountry.getOptions();
		// System.out.println(countryoptions.size());
		for (WebElement e : countryoptions) {
			String text = e.getText();
			// System.out.println(text);
			if (text.equals(optiontext)) {
				e.click();
			}
		}

	}

	/***
	 * @WAF to count elements in selected dropdown
	 * @param locator
	 * @return
	 */

	public int getSelectDDCount(By locator)

	{
		Select selectoptions = new Select(getElement(locator));
		List<WebElement> dropdownlist = selectoptions.getOptions();

		return dropdownlist.size();
	}

	/****
	 * @WAF select multiple otpions and deselect
	 * @param locator
	 * @param text1
	 * @param text2
	 */

	public void doMultiselectandDeselect(By locator, String text1, String text2) {
		Select sel = new Select(driver.findElement(locator));
		if (sel.isMultiple()) {
			sel.selectByVisibleText(text2);
			sel.selectByVisibleText(text1);
		}

		sel.deselectByVisibleText(text2);
	}

	/****
	 * @WAF to search keyword and click on specific element
	 * @param searchField
	 * @param searchKey
	 * @param suggestions
	 * @param value
	 */

	public void doSearch(By searchField, String searchKey, By suggestions, String value) {
		List<WebElement> sugglist = driver.findElements(suggestions);
		// creasting list of string for adding elements into list
		List<String> suggoptions = new ArrayList<String>();
		System.out.println(sugglist.size());

		for (WebElement e : sugglist) {
			String text = e.getText();
			// for aDDING TEXT INTO NEWLY CREATED LIST.
			suggoptions.add(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

		System.out.println(suggoptions);
	}

	public boolean doisDisplayed(By locator) {

		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed" + locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed" + locator);
			return false;
		}

	}

	public boolean doisDisplayed(By locator, int expectedelecount) {

		int elecount = driver.findElements(locator).size();
		if (expectedelecount == elecount) {
			System.out.println("element is displayed multiple times" + locator + "" + elecount);
			return true;
		}

		else {
			System.out.println("element is displyed one time" + locator);
			return false;
		}

	}
	
	
	/****************************************ActionsUTil***********************/
/**********
 * WAF to handle parent and sub menus using actions class	
 * @param parentloc
 * @param childloc
 * @throws InterruptedException
 */
	
	public  void  handleParentSubMenu(By parentloc, By childloc) throws InterruptedException
	{
		Actions act= new Actions(driver);
		act.moveToElement(getElement(parentloc)).build().perform();	
		Thread.sleep(3000);
		doClick(childloc);
	}
	
	
	
	public void draganddrop(By sourcelocator, By targetlocator)
	{
		Actions act= new Actions(driver);
		act.dragAndDrop(getElement(sourcelocator), getElement(targetlocator)).build().perform();
	//	act.clickAndHold(loc1).moveToElement(loc2).build().perform();		
	}
	
	
	
	public void doActionssendkeys(By locator, String val)
	{
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(locator),val).perform();
	}
	
	public void doActionsClick(By locator)
	{
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(locator)).perform();
	}
}

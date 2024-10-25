package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//1
@BeforeSuite
public void connectwithDB()
{
	System.out.println("Connecting with DB");
}
	
//2
@BeforeTest
public void createUser()
{
	System.out.println("creating user");
}
//3
@BeforeClass
public void launchBrowser()
{
	System.out.println("launching browser");
}

//4 6
@BeforeMethod
public void loginToApp()
{
	System.out.println("log in app");
}

//7
@Test
public void searchTest()
{
	System.out.println("Searching test");
}

//4
@Test
public void addToCart()
{
	System.out.println("adding to cart test");
}

//5 7
@AfterMethod
public void logoutApp()
{
	System.out.println("logging out app");
}

//before method Test AfterMEthod   these come in pair
//@Test always execute in aplhabetical order

@AfterClass
public void closingBrowser()
{
	System.out.println("Closing browser");
}


@AfterTest
public void deleteUSer()
{
	System.out.println("deleting user");
}


@AfterSuite
public void disconnectDB()
{
	System.out.println("disconnecting with DB");
}


}

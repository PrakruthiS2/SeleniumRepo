package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	String name;
	// we are expecting that we would have exception =expectedException,it doesnt handle exception, but expects exception, so the test will not fail
	
	//expectedExceptions is a class array , you can give 1 exception.class or multiple  exception classes
	@Test(priority=1, description="To test add to cart page", expectedExceptions= {ArithmeticException.class , NullPointerException.class})
	public void addToCartTest()
	{
		System.out.println("add to cart test");
	//	int i=9/0; 
	//	ExpectedExceptions obj=null;
	//	System.out.println(obj.name);
		
	}
}

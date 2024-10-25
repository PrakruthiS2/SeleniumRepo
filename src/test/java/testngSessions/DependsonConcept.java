package testngSessions;

import org.testng.annotations.Test;

//its an anti pattern structure, never use denpdsOnMethods
public class DependsonConcept {

	@Test
	public void loginTest()
	{
		System.out.println("login");
	}
	
	@Test(dependsOnMethods="loginTest")
	
		public void addToCart()
		{
			System.out.println("add to cart");
		}
	
}

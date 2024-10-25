package testngSessions;

import org.testng.annotations.Test;



// priority for running @Test
//priority can be duplicate //checks alphabetically
//priority not given takes default 0, will be run first
//negative priority also can be given
public class PriorityConcept {

	

	@Test(priority=2)
	public void testLoginPageTitle()
	{
		
		System.out.println("title");
		

	}
	@Test(priority=0)
	public void addToCart()
	{
		
		System.out.println("adding to cart");
		

	}
	
	
	
	@Test(priority=1)
	public void testURL()
	{
		
		System.out.println("url");
		

	}
	
	
@Test(priority=1)
public void searchTest() {
	
	System.out.println("searching");
	
	
}
	


	
}

package testngSessions;

import org.testng.annotations.Test;

//Inv//no of times test cases can be run
public class InvocationCountConcept {

	@Test(invocationCount=10)
	public void addUserTest()
	{
		System.out.println("add user");
	}
}

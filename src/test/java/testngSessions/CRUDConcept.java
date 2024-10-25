package testngSessions;

import org.testng.annotations.Test;


//follow AAA- Arrange Act Assert

public class CRUDConcept {

	public int addUser()
	{
		System.out.println("Adding user");
		return 123;
	}
	
	public String getUser(int uid)
	{
		System.out.println("getting the user");
		return "userinfo" +uid;
	}
	
	public String updateUser(int uid)
	
	{
		System.out.println("updateUser");
		return "updateduser"+uid;
		
	}
	
	public void deleteUser(int uid)
	{
		System.out.println("user is deleted");
	}
	
	
	@Test
	public void addUserTest()
	{
		int uid=addUser();
		System.out.println(uid);
	}
	
	@Test
	public void getUSerTest()
	{
		int uid=addUser();
		String userinfo=getUser(uid);
		System.out.println(userinfo);
		
	}
	
	
	@Test
	public void updateUserTest()
	{
		int uid=addUser();
		String updateduser=updateUser(uid);
		System.out.println(updateduser);
	}
	
	
	@Test
	public void deleteUserTest()
	{
		int uid=addUser();
		deleteUser(uid);
		getUser(uid);
	}
}

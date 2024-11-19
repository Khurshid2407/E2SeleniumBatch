package Sample;

import org.testng.annotations.Test;

public class TestNGTest {
	
	@Test(priority=2)
	public void createUser()
	{
		System.out.println("User create");
	}
	
	@Test(priority=3)
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	
	@Test(priority=1)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}

}

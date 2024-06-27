package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassWithBeforeAndAfterMethodForMultipleMethods {
	@BeforeMethod
	public void logIn()
	{
		Reporter.log("Login to application",true);
	}
	@Test
	public void addUser()
	{
		Reporter.log("User Added", true);
	}
	@Test
	public void modifyUser()
	{
		Reporter.log("User Details Modified", true);
	}
	@Test
	public void deleteUser()
	{
		Reporter.log("User deleted", true);
	}
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Logout from the application",true);
	}

}
/*Login to application
User Added
Logout from the application
Login to application
User deleted
Logout from the application
Login to application
User Details Modified
Logout from the application
PASSED: addUser
PASSED: deleteUser
PASSED: modifyUser * 
 * 
 * 
 */

package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassWithBeforeAndAfterMethod {
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
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Loigout from the application",true);
	}
}

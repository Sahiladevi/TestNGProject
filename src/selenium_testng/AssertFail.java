package selenium_testng;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test(dependsOnMethods="signUp")
	public void login()
	{
		Reporter.log("Login",true);
		
	}
	@Test
	public void signUp()
	{
		Reporter.log("SignUp",true);
		assertTrue(false);
	}
	@Test
	public void homePage()
	{
		Reporter.log("Home Page",true);
	}
	

}

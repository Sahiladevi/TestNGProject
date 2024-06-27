package selenium_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithAlwaysTrue {
	@Test
	public void signUp()
	{
		Assert.fail();//Intentionally making the script to get failed
		Reporter.log("SignUp",true);
	}
	@Test(dependsOnMethods="signUp",alwaysRun=true)
	public void login()
	{
		Reporter.log("Login",true);
	}
}
/*[RemoteTestNG] detected TestNG version 7.4.0
Login
PASSED: login
FAILED: signUp

===============================================
    Default test
    Tests run: 2, Failures: 1, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 1, Failures: 1, Skips: 0
 * 
 */


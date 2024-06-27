package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithMultipleMethods {
	@Test
	public void createAccount()
	{
		Reporter.log("Create Account",true);
	}
	@Test
	public void editAccount()
	{
		Reporter.log("Edit Account",true);
	}
	@Test
	public void deleteAccount()
	{
		Reporter.log("Delete Account",true);
	}
}

/*OUTPUT:
 * Create Account
Delete Account
Edit Account
 */



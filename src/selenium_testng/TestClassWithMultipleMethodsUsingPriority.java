package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithMultipleMethodsUsingPriority {
	@Test(priority=0)
	public void createAccount()
	{
		Reporter.log("Create Account",true);
	}
	@Test(priority=1)
	public void editAccount()
	{
		Reporter.log("Edit Account",true);
	}
	@Test(priority=2)
	public void deleteAccount()
	{
		Reporter.log("Delete Account",true);
	}
}
/*OUTPUT:
 * Create Account
Edit Account
Delete Account
 */


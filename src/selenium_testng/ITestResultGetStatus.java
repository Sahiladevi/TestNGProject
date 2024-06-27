package selenium_testng;

import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultGetStatus{
	@Test
	public void login()
	{
		Reporter.log("login",true);
	}
	@Test
	public void home()
	{
		Reporter.log("Home",true);
		Assert.fail();
	}
	@AfterMethod
	public void results(ITestResult result)
	{
		int res = result.getStatus();
		Reporter.log(""+res, true);
	}

}

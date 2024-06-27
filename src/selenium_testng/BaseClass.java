package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	@BeforeClass
	public void preCondition()
	{
		Reporter.log("Launch the Browser", true);
		Reporter.log("Open the Application", true);
	}
	@AfterClass
	public void postCondition()
	{
		Reporter.log("Close the Browser", true);		
	}

}

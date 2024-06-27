package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithMultipleMethodsUsingDependsOnGroups {
	@Test(dependsOnGroups="sample")
	public void test1()
	{
		Reporter.log("Test1",true);
	}
	@Test(groups="sample")
	public void test2()
	{
		Reporter.log("Test2",true);
	}

	@Test(groups="sample")
	public void test3()
	{
		Reporter.log("Test3",true);
	}

	@Test(groups="sample")
	public void test4()
	{
		Reporter.log("Test4",true);
	}

	@Test(groups="sample")
	public void test5()
	{
		Reporter.log("Test5",true);
	}
}
/*[RemoteTestNG] detected TestNG version 7.4.0
Test2
Test3
Test4
Test5
Test1
PASSED: test4
PASSED: test5
PASSED: test3
PASSED: test2
PASSED: test1

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
===============================================
*/

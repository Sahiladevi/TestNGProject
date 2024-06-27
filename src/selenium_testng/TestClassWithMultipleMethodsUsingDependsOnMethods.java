package selenium_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithMultipleMethodsUsingDependsOnMethods {

	@Test
	public void contactList() {
		Reporter.log("Contact added to the List",true);
		
	}

	@Test(dependsOnMethods="contactList")
	public void chat() {
		Reporter.log("chat enabled",true);
		
	}
}
/*OUTPUT:
 * RemoteTestNG] detected TestNG version 7.4.0
Contact added to the List
chat enabled
PASSED: contactList
PASSED: chat

 */


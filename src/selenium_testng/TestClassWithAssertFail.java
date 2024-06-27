package selenium_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassWithAssertFail {
	@Test
	public void signUp()
	{
		Assert.fail();//Intentionally making the script to get failed
		Reporter.log("SignUp",true);
	}
	@Test(dependsOnMethods="signUp")
	public void login()
	{
		Reporter.log("Login",true);
	}

}
/*
 [RemoteTestNG] detected TestNG version 7.4.0
FAILED: signUp
java.lang.AssertionError: null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.fail(Assert.java:106)
	at selenium_testng.TestClassWithAssertFail.signUp(TestClassWithAssertFail.java:11)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)

SKIPPED: login
java.lang.Throwable: Method TestClassWithAssertFail.login()[pri:0, instance:selenium_testng.TestClassWithAssertFail@bd4dc25] depends on not successfully finished methods
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:102)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)


===============================================
    Default test
    Tests run: 2, Failures: 1, Skips: 1
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 0, Failures: 1, Skips: 1
===============================================
 */

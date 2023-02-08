package testNG_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListners implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("before all test execution..." + context.getName());
	}
	
	public void onFinish(ITestContext context) {
	    System.out.println("after all test executed " + context.getName());
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("test started - " + result.getTestName());
	  }
	
	public  void onTestSuccess(ITestResult result) {
		    System.out.println("test succeeded - " + result.getTestName());
	 }
	
	public  void onTestFailure(ITestResult result) {
	    System.out.println("test failed" + result.getTestName());
	  }
	
	public void onTestSkipped(ITestResult result) {
		   System.out.println("test skipped - " + result.getTestName());
		}

	
	

}

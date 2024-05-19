package testNG_listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNG_listeners.CustomeListners.class)
public class ListnersTest_V1 {
	
	@Test
	public void successTest() {
		boolean flag = true;
		Assert.assertTrue(flag);
	}
	
	@Test
	public void failTest() {
		boolean flag = false;
		Assert.assertTrue(flag);
	}
	
	@Test(dependsOnMethods = "failTest")
	public void skipTest() {
		boolean flag = true;
		//throw new SkipException("test skipped explicitely");
		System.out.println("test skipped");
		
	}
	

}

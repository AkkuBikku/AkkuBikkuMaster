package testNG_parallelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ParallelTest2 {
	WebDriver driver = null;
	
	@Test
	public void loginTest()  throws Exception {
		System.setProperty("webdriver.edge.driver", "F:\\Libraries/msedgedriver.exe");
		
		 driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		boolean flag = true;
		Assert.assertTrue(flag);
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeDown() {
		driver.quit();
	}
	
}

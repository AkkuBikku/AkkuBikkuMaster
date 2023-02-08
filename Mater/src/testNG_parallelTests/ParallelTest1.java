package testNG_parallelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
	WebDriver driver = null;
	
	@Test
	public void logoTest()  throws Exception {
		System.setProperty("webdriver.edge.driver", "F:\\Libraries/msedgedriver.exe");
		
		 driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		
		boolean flag = true;
		Assert.assertTrue(flag);
		Thread.sleep(5000);
	}

	@Test
	public void verifyTitle() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\Libraries/msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = "facebook";
		Assert.assertEquals("facebook", title);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeDown() {
		driver.quit();
	}
	
}

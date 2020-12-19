package com.michaelkors.testCases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.LoginPage;
import com.michaelkors.testBase.BaseClass;

public class TC_LoginTest_003 extends BaseClass{

	
	
	@Test(groups={"sanity","regression","master"})
	public void LoginTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_LoginTest_003 ******");
		
		driver.get(configPropObj.getProperty("loginURL"));
		
		LoginPage login=new LoginPage(driver);
		Thread.sleep(3000);
		login.clicksign();
		login.setEmailName("khanasif.qa@gmail.com");
		login.setPassword("Admin123");
		Thread.sleep(3000);
		login.clickLogin();
		Thread.sleep(3000);
		try {
		login.clicksignout();
	
		}
		catch(org.openqa.selenium.NoSuchElementException ex)
		{
			
		}
		// validation
				if (login.verifyConfirmationMsg()) {
					logger.info("***************  Michaelkors login succesfully Passed *********** ");
					Assert.assertTrue(true);

				} else {
					logger.error("*************** Michaelkors login failed *********** ");
					captureScreen(driver,"login");
					Assert.assertTrue(false);
				}
				logger.info("***************   TC_LoginTest_003 Finished  *********** ");
			
		
	
	}
}

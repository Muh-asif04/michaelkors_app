package com.michaelkors.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.MenPage;
import com.michaelkors.testBase.BaseClass;

public class TC_MenTest_006 extends BaseClass {

	
	@Test(groups={"sanity","master"})
	public void MenTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_MenTest_006 ******");
		
		driver.get(configPropObj.getProperty("menURL"));
		MenPage men=new MenPage(driver);
		
		men.clickmen();
		men.clickwatches();
		men.clickgoldtone();
		Thread.sleep(3000);
		men.clickGen5BradshawGoldTone();
		men.clickcolorgold();
		Thread.sleep(3000);
		men.clickdropdown();	
		Thread.sleep(3000);
		men.clickbtnaddtobag();
		Thread.sleep(3000);
		men.clickbtnpickupinstore();
	
		
		
		
	
		
		// validation
		if (men.verifyConfirmationMsg()) {
			logger.info("***************  Men Test succesfully Passed *********** ");
			Assert.assertTrue(true);

		} else {
			logger.error("*************** Men Test failed *********** ");
			captureScreen(driver,"Men");
			Assert.assertTrue(false);
		}
		logger.info("***************   TC_MenTest_006 Finished  *********** ");
	
		
	}
	
}

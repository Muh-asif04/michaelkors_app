package com.michaelkors.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.HandBagsPage;
import com.michaelkors.testBase.BaseClass;

public class TC_HandBagsTest_007 extends BaseClass{

	
	@Test(groups={"sanity","regression","master"})
	public void HandBagsTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_HandBagsTest_007 ******");
		
		driver.get(configPropObj.getProperty("handbagsURL"));
		HandBagsPage hb=new HandBagsPage(driver);
		
		hb.clickhandbags();
		hb.clickviewallhandbags();
		hb.clickSHOULDERBAGS();
		hb.clickSohoLargeQuiltedLeatherShoulderBag();
		Thread.sleep(3000);
		hb.clickcolor();
		Thread.sleep(3000);
		hb.clicLUGGAGE();
		Thread.sleep(3000);
		hb.clickdropdown();
		Thread.sleep(3000);
		hb.clickaddtobag();
		Thread.sleep(3000);
		hb.clickcheckout();
		
		

		// validation
		if (hb.verifyConfirmationMsg()) {
			
			logger.info("***************  handbags Test succesfully Passed *********** ");
			Assert.assertTrue(true);

		} else {
			logger.error("*************** handbags Test failed *********** ");
			captureScreen(driver,"Hand Bags");
			Assert.assertTrue(false);
		}
		logger.info("***************   TC_HandBagsTest_007 Finished  *********** ");
	
	
		
	}
}


package com.michaelkors.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.WalletsPage;
import com.michaelkors.testBase.BaseClass;

public class  TC_WalletsTest_008 extends BaseClass{

	
	@Test(groups={"sanity","regression","master"})
	public void WalletsTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_WalletsTest_008 ******");
		
		driver.get(configPropObj.getProperty("walletsURL"));
		WalletsPage wp=new WalletsPage(driver);
		wp.clickwallets();
		wp.clickviewallwallets();
		wp.clickPHONETRAVEL();
		wp.LogoandLeatherConvertibleCrossbodyBag();
		wp.clickBRNACORN();
		Thread.sleep(3000);
		wp.clickdropdown();
		wp.clickaddtobag();
		Thread.sleep(3000);
	/*	wp.clickpickupinstore();
		wp.setZipCode("08817");
		Thread.sleep(3000);
		wp.clickbtnsearch();
		Thread.sleep(3000);
		wp.clickaddandpickup();
		Thread.sleep(3000);*/
		wp.clickcheckout();
	
			// validation
		if (wp.verifyConfirmationMsg()) {
			logger.info("***************  Wallet Test succesfully Passed *********** ");
			Assert.assertTrue(true);

		} else {
			logger.error("*************** Wallet Test failed *********** ");
			captureScreen(driver,"Wallet");
			Assert.assertTrue(false);
		}
		logger.info("***************   TC_WalletsTest_008 Finished  *********** ");
		
		
	}
}

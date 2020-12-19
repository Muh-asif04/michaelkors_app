package com.michaelkors.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.ShoesPage;
import com.michaelkors.testBase.BaseClass;

public class TC_ShoesTest_009 extends BaseClass{

	
	@Test(groups={"sanity","regression","master"})
	public void ShoesTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_ShoesTest_009 ******");
		
		driver.get(configPropObj.getProperty("shoesURL"));
		ShoesPage sp=new ShoesPage(driver);
		
		sp.clickshoes();
		sp.clickviewallshoes();
		sp.clickpumps();
		Thread.sleep(3000);
		sp.clickkekesuedepump();
		Thread.sleep(3000);
		sp.clickTUSCANROSE();
		Thread.sleep(3000);
		sp.clicksizeguide();
		Thread.sleep(3000);
		sp.clickbtncollapsesizeguide();
		sp.clicksize();
		Thread.sleep(3000);
		sp.clickdropdown();
		Thread.sleep(3000);
		sp.clickaddtobag();
		Thread.sleep(3000);
		sp.clickbtnpickupinstore();
		Thread.sleep(3000);
		sp.setZipCode("08817");
		Thread.sleep(3000);
		sp.clickbtnsearch();
		
		
		// validation
		if (sp.verifyConfirmationMsg()) {
			logger.info("***************  ShoesTest succesfully Passed *********** ");
			Assert.assertTrue(true);

		} else {
			logger.error("*************** ShoesTest failed *********** ");
			captureScreen(driver,"Shoes");
			Assert.assertTrue(false);
		}
		logger.info("***************   TC_ShoesTest_009 Finished  *********** ");
	
	}
}

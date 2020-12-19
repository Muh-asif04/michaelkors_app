package com.michaelkors.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.WomenPage;
import com.michaelkors.testBase.BaseClass;

public class TC_WomenTest_005 extends BaseClass{

	
	@Test(groups={"regression","master"})
	public void WomenTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_WomenTest_005 ******");
		
		driver.get(configPropObj.getProperty("womenURL"));
		
		WomenPage women=new WomenPage(driver);
		women.clickwomen();
		women.clickclothing();
		women.clickskirtsshorts();
		women.clickLogo();
		women.clickWHITETRUENAVYcolor();
		women.clickm();
	    Thread.sleep(3000);
		women.clickdropdown();
		Thread.sleep(3000);
		women.clickaddtobag();
		Thread.sleep(3000);
		women.clickpickupinstore();
		women.setZipCode("08817");
		Thread.sleep(3000);
		women.clickbtnsearch();
		
		
			
			
			// validation
					if (women.verifyConfirmationMsg()) {
						logger.info("***************  Women Test succesfully Passed *********** ");
						Assert.assertTrue(true);

					} else {
						logger.error("*************** Women Test failed *********** ");
						captureScreen(driver,"women");
						Assert.assertTrue(false);
					}
					logger.info("***************   TC_WomenTest_005 Finished  *********** ");
				
		
		
	}
	
	
}

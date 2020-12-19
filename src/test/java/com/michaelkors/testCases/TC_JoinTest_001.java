package com.michaelkors.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.JoinPage;
import com.michaelkors.testBase.BaseClass;



public class TC_JoinTest_001 extends BaseClass {

	
	
	
	@Test(groups={"sanity","regression","master"})
	public void JoinTest() throws InterruptedException, IOException
	{
		logger.info("*****Starting TC_JoinTest_001 ******");
		
		driver.get(configPropObj.getProperty("baseURL"));
		JoinPage lp=new JoinPage(driver);
		
		logger.info("*****Providing Joinpage details ******");
		
		lp.setFirstName(configPropObj.getProperty("userfirstname"));
		lp.setLastName(configPropObj.getProperty("userlastname"));
		lp.setEmailName(configPropObj.getProperty("useremail"));
		lp.setPasswordName(configPropObj.getProperty("userpassword"));
		lp.settxtConfirmPassword(configPropObj.getProperty("userconfirmpassword"));
		lp.settxtPostalCode(configPropObj.getProperty("postalcode"));
		lp.settxtBrithMonth(configPropObj.getProperty("monthname"));
		lp.settxtBrithDay(configPropObj.getProperty("dayname"));
		lp.clickradio();
		Thread.sleep(3000);
		lp.clickcheckbox();
		Thread.sleep(3000);
		lp.clickjoinbox();
		Thread.sleep(3000);
		
		String exp_title="myAccount";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
			
		{
			logger.info("*****Joinpage passed ******");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("*****Joinpage failed ******");
			captureScreen(driver,"JoinTest");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC_JoinTest_001 ******");
	}
	
}

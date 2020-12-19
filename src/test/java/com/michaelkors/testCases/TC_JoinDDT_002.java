package com.michaelkors.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.JoinPage;
import com.michaelkors.testBase.BaseClass;
import com.michaelkors.utilities.XLUtils;

public class TC_JoinDDT_002 extends BaseClass 

{
	@Test(dataProvider="JoinData",groups={"master"})
	public void JoinDDT(String firstname, String lastname, String email, String pwd, String postalcode, String month, String day, String male, String exp) throws InterruptedException
	{
		logger.info("*****Starting TC_JoinDDT_002 ******");
		
		driver.get(configPropObj.getProperty("baseURL"));
		JoinPage lp=new JoinPage(driver);
		
		
		lp.setFirstName(firstname);
		lp.setLastName(lastname);
		lp.setEmailName(email);
		lp.setPasswordName(pwd);
		lp.settxtPostalCode(postalcode);
		lp.settxtBrithMonth(month);
		lp.settxtBrithDay(day);
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
			if(exp.equals("Pass"))
			{
				logger.info("**** Join Test passed **** ");
				Thread.sleep(3000);
				Assert.assertTrue(true);
			}
			else if(exp.equals("Fail"))
			{
				logger.info("**** Join Test Failed **** ");
				Thread.sleep(3000);
				Assert.assertTrue(false);
			}
			else if(!exp_title.equals(act_title))
			{
				if(exp.equals("Pass"))
				{
					logger.warn("**** Join Failed **** ");
					Assert.assertTrue(false);
				}
				else if(exp.equals("Fail"))
				{
					logger.info("**** Join Passed **** ");
					Assert.assertTrue(true);
				}
			}
		}
		logger.info("**** Finished TC_JoinDDT_002 **** ");
	}
	
	
	
	
	@DataProvider(name="JoinData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/testData/JoinData.xlsx";
		
		int totalrows=XLUtils.getRowCount(path, "Sheet1");     //4
		int totalcols=XLUtils.getCellCount(path, "Sheet1", 1);  //9
		
		String joindata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				joindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);   //1,0
			}
		}
		return joindata;
	}
	
}

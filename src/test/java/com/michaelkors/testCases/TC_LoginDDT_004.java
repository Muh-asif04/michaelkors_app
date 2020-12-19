package com.michaelkors.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.michaelkors.pageObjects.LoginPage;
import com.michaelkors.testBase.BaseClass;
import com.michaelkors.utilities.XLUtils;

public class TC_LoginDDT_004 extends BaseClass
{
	
	
	@Test(dataProvider="LoginData",groups={"master"})
	public void loginTest(String email, String pwd, String exp) throws InterruptedException
	{
		logger.info(" ***** String TC_LoginDDT_004 ***** ");
		
		driver.get(configPropObj.getProperty("loginURL"));
		
		LoginPage login=new LoginPage(driver);
		Thread.sleep(3000);
		login.clicksign();
		login.setEmailName(email);
		login.setPassword(pwd);
		Thread.sleep(3000);
		login.clickLogin();
		Thread.sleep(3000);
		try {
		login.clicksignout();
		}
		catch(org.openqa.selenium.json.JsonException a )
		{
		
		}
			
				
		
		Thread.sleep(3000);
	String exp_title="Michael Kors USA: Designer Handbags, Clothing, Menswear, Watches, Shoes, And  More";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			if(exp.equals("Pass"))
			{
				logger.info("***** login test passed");
				login.clicksignout();
				Thread.sleep(3000);
				Assert.assertTrue(true);
			}
			else if(exp.equals("fail"))
			{
				logger.info("**** login test failed *****");
				login.clicksignout();
				Thread.sleep(3000);
				Assert.assertTrue(false);
			}
			else if(!exp_title.equals(act_title))
			{
				if (exp.equals("Passed"))
				{
					logger.warn("***** login failed");
					Assert.assertTrue(false);
				}
				else if(exp.equals("Fail"))
				{
					logger.info("**** login passed");
					Assert.assertTrue(true);
				}
			}
		}
		logger.info("***** Finished the TC_LoginDDT_004 *****");
	}
	
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\testData\\LoginData.xlsx";
	
		int totalrows=XLUtils.getRowCount(path, "Sheet1");
		int totalcols=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); //1,0
			}
		}
	return logindata;
	
	}
	
	
}

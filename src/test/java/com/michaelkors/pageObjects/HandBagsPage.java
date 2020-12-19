package com.michaelkors.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandBagsPage {

	WebDriver driver;
	public HandBagsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
	
	@FindBy(xpath="//*[@id=\"HeaderHambergerMenu\"]/div[5]/nav/div/div/div[1]/ul/li[4]/div/div[1]/a")
	@CacheLookup
	WebElement clickhandbags;
	
	@FindBy(xpath="//a[.='VIEW ALL HANDBAGS']")
	@CacheLookup
	WebElement clickviewallhandbags;
	
	@FindBy(xpath="//a[contains(text(),'SHOULDER BAGS')]")
	@CacheLookup
	WebElement clickSHOULDERBAGS;
	
	@FindBy(xpath="//img[@alt='Soho Large Quilted Leather Shoulder Bag']")
	@CacheLookup
	WebElement clickSohoLargeQuiltedLeatherShoulderBag;

	@FindBy(xpath="//span[text()='COLOR']")
	@CacheLookup
	WebElement clickcolor;
	
	@FindBy(xpath="//input[@title='LUGGAGE']")
	@CacheLookup
	WebElement clicLUGGAGE;
	
	@FindBy(xpath="//span[@class='Select-value-label']")
	@CacheLookup
	WebElement clickdropdown;
		
	@FindBy(xpath="//a[contains(text(),'add to bag')]")
	@CacheLookup
	WebElement clickaddtobag;
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	@CacheLookup
	WebElement clickcheckout;
	
	
	
	
	
	
	
	public void clickhandbags()
	{
		clickhandbags.click();
	}
	
	public void clickviewallhandbags()
	{
		clickviewallhandbags.click();
	}
	
	public void clickSHOULDERBAGS()
	{
		clickSHOULDERBAGS.click();
	}
	
	public void clickSohoLargeQuiltedLeatherShoulderBag()
	{
		clickSohoLargeQuiltedLeatherShoulderBag.click();
	}
	
	public void clickcolor()
	{
		clickcolor.click();
	}
	
	public void clicLUGGAGE()
	{
		clicLUGGAGE.click();
	}
	
	public void clickdropdown() throws InterruptedException
	{
		clickdropdown.click();
		Thread.sleep(2000);//);sleep(3000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
		new Actions(driver).sendKeys(Keys.ENTER).perform();
	     
		Thread.sleep(2000);
	}
	
	public void clickaddtobag()
	{
		clickaddtobag.click();
	}
	
	public void clickcheckout()
	{
		clickcheckout.click();
	}
	
	
	
	public boolean verifyConfirmationMsg()
	{
		String msg=driver.getTitle();
		if (msg.contains("Shopping Cart"))
		{
			return true;
		}
		else
		{
			return false;
		}
	  }
	}

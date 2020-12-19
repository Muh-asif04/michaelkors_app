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

public class WalletsPage {
	
	
	WebDriver driver;
	public WalletsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
	
	
	@FindBy(xpath="//a[contains(.,'WALLETS')]")
	@CacheLookup
	WebElement clickwallets;
	
	@FindBy(xpath="//a[.='VIEW ALL WALLETS']")
	@CacheLookup
	WebElement clickviewallwallets;
	
	@FindBy(xpath="//a[.='PHONE & TRAVEL']")
	@CacheLookup
	WebElement clickPHONETRAVEL;
	
	@FindBy(xpath="//img[@alt='Logo and Leather Convertible Crossbody Bag']")
	@CacheLookup
	WebElement LogoandLeatherConvertibleCrossbodyBag;
	
	@FindBy(xpath="//input[@title='BRN/ACORN']")
	@CacheLookup
	WebElement clickBRNACORN;
	
	@FindBy(xpath="//span[@class='Select-arrow']")
	@CacheLookup
	WebElement clickdropdown;
		
	@FindBy(xpath="//a[.='add to bag']")
	@CacheLookup
	WebElement clickaddtobag;
	
	/*@FindBy(xpath="//input[@id='search-location']")
	@CacheLookup
	WebElement txtzip;
	
	@FindBy(xpath="//button[contains(text(),'SEARCH')]")
	@CacheLookup
	WebElement clickbtnsearch;
	
	@FindBy(name="add-and-pickup")
	@CacheLookup
	WebElement clickaddandpickup;*/
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	@CacheLookup
	WebElement clickcheckout;

	
	public void clickwallets()
	{
		clickwallets.click();
	
	}
	
	public void clickviewallwallets()
	{
		clickviewallwallets.click();
	
	}
	
	public void clickPHONETRAVEL()
	{
		clickPHONETRAVEL.click();
	
	}
	
	public void LogoandLeatherConvertibleCrossbodyBag()
	{
		LogoandLeatherConvertibleCrossbodyBag.click();
	
	}
	
	public void clickBRNACORN()
	{
		clickBRNACORN.click();
	
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
	
	/*public void setZipCode(String zip)
	{
		txtzip.clear();
		txtzip.sendKeys(zip);
	}
	
	public void clickbtnsearch()
	{
		clickbtnsearch.click();
	
	}
	
	public void clickaddandpickup()
	{
		clickaddandpickup.click();
	
	}*/
		
	public void clickcheckout()
	{
		clickcheckout.click();
	
	}
	

	public boolean verifyConfirmationMsg()
	{
		String msg=driver.findElement(By.xpath("Add to bag")).getText();
		if (msg.contains("Checkout"))
		{
			return true;
		}
		else
		{
			return false;
		}
	  }
	}
	


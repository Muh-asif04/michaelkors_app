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
import org.openqa.selenium.support.ui.Select;

public class ShoesPage {

	WebDriver driver;
	public ShoesPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
	driver.manage().window().maximize();
	
	}
	@FindBy(xpath="//a[contains(.,'SHOES')]")
	@CacheLookup
	WebElement clickshoes;
	
	@FindBy(xpath="//a[.='VIEW ALL SHOES']")
	@CacheLookup
	WebElement clickviewallshoes;
	
	@FindBy(xpath="//a[contains(text(),'PUMPS')]")
	@CacheLookup
	WebElement clickpumps;
	
	@FindBy(xpath="//img[@alt='Keke Suede Pump']")
	@CacheLookup
	WebElement clickkekesuedepump;
		
	
	@FindBy(xpath="//input[@title='TUSCAN ROSE']")
	@CacheLookup
	WebElement clickTUSCANROSE;
	
	@FindBy(xpath="//a[contains(text(),'Size Guide')]")
	@CacheLookup
	WebElement clicksizeguide;
	
	@FindBy(xpath="//button[@aria-label='collapse sizeguide']")
	@CacheLookup
	WebElement clickbtncollapsesizeguide;
	
	@FindBy(xpath="//label[contains(text(),'10')]")
	@CacheLookup
	WebElement clicksize;
	
	@FindBy(xpath="//div[@class='Select-value']")
	@CacheLookup
	WebElement clickdropdown;
	
	@FindBy(xpath="//a[contains(text(),'add to bag')]")
	@CacheLookup
	WebElement clickaddtobag;
	
	@FindBy(xpath="//button[.='PICK UP IN STORE']")
	@CacheLookup
	WebElement clickbtnpickupinstore;
	
	@FindBy(xpath="//input[@id='search-location']")
	@CacheLookup
	WebElement txtzip;
	
	@FindBy(xpath="//button[.='SEARCH']")
	@CacheLookup
	WebElement clickbtnsearch;
	
	
	public void clickshoes()
	{
		clickshoes.click();
	}
	
	public void clickviewallshoes()
	{
		clickviewallshoes.click();
	}
	
	public void clickpumps()
	{
		clickpumps.click();
	}
	
	public void clickkekesuedepump()
	{
		clickkekesuedepump.click();
	}
	
	public void clickTUSCANROSE()
	{
		clickTUSCANROSE.click();
	}
	
	public void clicksizeguide()
	{
		clicksizeguide.click();
	}
	
	public void clickbtncollapsesizeguide()
	{
		clickbtncollapsesizeguide.click();
	}
	
	public void clicksize()
	{
		clicksize.click();
	}
	
	/*public void clickdropdown() throws InterruptedException
	{
		clickdropdown.click();	
	}*/
	
	
	public void clickdropdown() throws InterruptedException
	{
		clickdropdown.click();
		Thread.sleep(2000);//);sleep(3000);
		//new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
	     
		Thread.sleep(2000);
	}
	
	public void clickaddtobag()
	{
		clickaddtobag.click();
	}
	
	public void clickbtnpickupinstore()
	{
		clickbtnpickupinstore.click();
	}
	
	public void setZipCode(String zip)
	{
		txtzip.clear();
		txtzip.sendKeys(zip);
	}
	
	public void clickbtnsearch()
	{
		clickbtnsearch.click();
	}
	
	public boolean verifyConfirmationMsg()
	{
		String msg=driver.findElement(By.xpath("//button[.='SEARCH']")).getText();
		if (msg.contains("SEARCH"))
		{
			return true;
		}
		else
		{
			return false;
		}
	  }
	}

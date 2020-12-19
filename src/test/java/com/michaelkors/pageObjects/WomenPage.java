package com.michaelkors.pageObjects;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WomenPage {

	WebDriver driver;
	public WomenPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
	
	@FindBy(xpath="//*[@id=\"HeaderHambergerMenu\"]/div[5]/nav/div/div/div[1]/ul/li[1]/div/div[1]/a")
	@CacheLookup
	WebElement clickwomen;
	
	@FindBy(xpath="//a[contains(text(),'CLOTHING')]")
	@CacheLookup
	WebElement clickdropdownclothing;
	
	@FindBy(xpath="//a[contains(text(),'Skirts & Shorts')]")
	@CacheLookup
	WebElement clickskirtsshorts;
	
	@FindBy(xpath="//img[@alt='Logo Tape Stretch-Viscose Pencil Skirt']")
	@CacheLookup
	WebElement clickLogoViscosePencilSkirt;
	
	@FindBy(xpath="//input[@title='WHITE/TRUE NAVY']")
	@CacheLookup
	WebElement clickWHITETRUENAVYcolor;
	
	@FindBy(xpath="//a[contains(text(),'Size')]")
	@CacheLookup
	WebElement clicksizedropdown;
	
	@FindBy(xpath="//label[text()='M']")
	@CacheLookup
	WebElement clickm;
	
	@FindBy(xpath="//div[@class='Select-value']")
	@CacheLookup
	WebElement clickdropdown;
	
	@FindBy(xpath="//a[contains(text(),'add to bag')]")
	@CacheLookup
	WebElement clickaddtobag;
	
	@FindBy(xpath="//button[contains(text(),'PICK UP IN STORE')]")
	@CacheLookup
	WebElement clickpickupinstore;
	
	@FindBy(xpath="//input[@id='search-location']")
	@CacheLookup
	WebElement txtzip;
	
	@FindBy(xpath="//button[.='SEARCH']")
	@CacheLookup
	WebElement clickbtnsearch;
	
	
	
	public void clickwomen() throws InterruptedException
	{
		Actions action =    new Actions(driver);
        action.moveToElement(clickwomen).perform();
        Thread.sleep(5000);
        
	}
	public void clickclothing()
	{
		clickdropdownclothing.click();
	}
		
	public void clickskirtsshorts()
	{
		clickskirtsshorts.click();
	}
	
	public void clickLogo()
	{
		clickLogoViscosePencilSkirt.click();
	}
	
	public void clickWHITETRUENAVYcolor()
	{
		clickWHITETRUENAVYcolor.click();
	}
	public void clicksizedropdown()
	{
		clicksizedropdown.click();	
	}
	public void clickm()
	{
		clickm.click();
	}
	
	public void clickdropdown() throws InterruptedException
	{
		Thread.sleep(3000);
		clickdropdown.click();
		
	}
	
	public void clickaddtobag()
	{
		clickaddtobag.click();
	}
	
	
	public void clickpickupinstore()
	{
		clickpickupinstore.click();
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


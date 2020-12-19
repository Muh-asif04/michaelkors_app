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

public class MenPage {

	WebDriver driver;
	public MenPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
		@FindBy(xpath="//a[contains(text(),'MEN')]")
		@CacheLookup
		WebElement clickmen;
		
		@FindBy(xpath="//a[@title='WATCHES']")
		@CacheLookup
		WebElement clickwatches;
		
		@FindBy(xpath="//a[.='Gold-Tone']")
		@CacheLookup
		WebElement clickgoldtone;
		
		@FindBy(xpath="//img[@alt='Gen 5 Bradshaw Gold-Tone Smartwatch']")
		@CacheLookup
		WebElement clickGen5BradshawGoldTone;
		
		@FindBy(xpath="//input[@title='GOLD']")
		@CacheLookup
		WebElement clickcolorgold;
		
		@FindBy(xpath="//div[@class='Select-value']")
		@CacheLookup
		WebElement clickdropdown;
		
		
		@FindBy(xpath="//button[@aria-label='add to bag']")
		@CacheLookup
		WebElement clickbtnaddtobag;
		
		@FindBy(xpath="//button[.='PICK UP IN STORE']")
		@CacheLookup
		WebElement clickbtnpickupinstore;
		
		
		public void clickmen()
		{
			clickmen.click();
		}
		
		public void clickwatches()
		{
			clickwatches.click();
		}
		
		public void clickgoldtone()
		{
			clickgoldtone.click();
		}
		
		public void clickGen5BradshawGoldTone()
		{
			clickGen5BradshawGoldTone.click();
		}
			
			public void clickcolorgold()
			{
				clickcolorgold.click();
				
		}
		
			public void clickdropdown() throws InterruptedException
			{
				clickdropdown.click();
				Thread.sleep(2000);
				new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
				new Actions(driver).sendKeys(Keys.ENTER).perform();
			     
				Thread.sleep(2000);
			}
			
			public void clickbtnaddtobag()
			{
				clickbtnaddtobag.click();
				
		}

		
			public void clickbtnpickupinstore()
			{
				clickbtnpickupinstore.click();
				
		}
			
			
	public boolean verifyConfirmationMsg()
		{
			String msg=driver.findElement(By.xpath("//button[.='PICK UP IN STORE']")).getText();
			if (msg.contains("PICK UP IN STORE"))
			{
				return true;
			}
			else
			{
				return false;
			}
		  }
		}


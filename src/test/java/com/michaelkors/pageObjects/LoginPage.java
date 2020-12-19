package com.michaelkors.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
	
	@FindBy(xpath="//a[text()='Sign In']")
	@CacheLookup
	WebElement clickLogin;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(name="sign-in")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	@CacheLookup
	WebElement linksignout;
	
	@FindBy(xpath="//a[.='Hello, Asif']")
	@CacheLookup
	WebElement linkhello;
		
	public void setEmailName(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
		public void clickLogin()
		{
		btnLogin.click();
		
		}
		
		public void clicksign()
		{
		clickLogin.click();
		
		}
		
		public void clicksignout() throws InterruptedException
		{
			Actions action =    new Actions(driver);
	        action.moveToElement(linkhello).perform();
	        Thread.sleep(2000);
	        action.click(linksignout).perform();
			
	}
	
		public boolean verifyConfirmationMsg()
		{
			String msg=driver.findElement(By.xpath("//a[.='Hello, Asif']")).getText();
			if (msg.contains("Hello, Asif"))
			{
				return true;
			}
			else
			{
				return false;
			}
		  }
		}
	


package com.michaelkors.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinPage {

	WebDriver driver;
	public JoinPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(name="firstName")
		@CacheLookup
		WebElement txtName;
		
		@FindBy(id="last_name")
		@CacheLookup
		WebElement txtID;
		
		@FindBy(id="email_address")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(id="password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(id="confirm_password")
		@CacheLookup
		WebElement txtConfirmPassword;
		
		@FindBy(name="postalCode")
		@CacheLookup
		WebElement txtPostalCode;
		
		@FindBy(id="birth_month")
		@CacheLookup
		WebElement txtBrithMonth;
		
		@FindBy(id="birth_date")
		@CacheLookup
		WebElement txtBrithDay;
		
		@FindBy(id="gender_male")
		@CacheLookup
		WebElement clickradio;
		
		@FindBy(xpath="//label[contains(text(),'Yes, sign me up! I want to receive news, style tip')]")
		@CacheLookup
		WebElement clickcheckbox;
		
		@FindBy(xpath="//input[@title='JOIN KORSVIP']")
		@CacheLookup
		WebElement clickjoinbox;
		
		
		
		
		public void setFirstName(String firstname)
		{
			txtName.clear();
			txtName.sendKeys(firstname);
		}
		
		public void setLastName(String lastname)
		{
			txtID.clear();
			txtID.sendKeys(lastname);
		}
		
		public void setEmailName(String email)
		{
			txtEmail.clear();
			txtEmail.sendKeys(email);
			
		}
		
		public void setPasswordName(String password)
		{
			txtPassword.clear();
			txtPassword.sendKeys(password);
		}
		
		public void settxtConfirmPassword(String Password)
		{
			txtConfirmPassword.clear();
			txtConfirmPassword.sendKeys(Password);
			
		}
		
		public void settxtPostalCode(String Postal )
		{
			txtPostalCode.clear();
			txtPostalCode.sendKeys(Postal);
			
		}
		
		public void settxtBrithMonth(String Month )
		{
			txtBrithMonth.clear();
			txtBrithMonth.sendKeys(Month);
			
		}
		
		public void settxtBrithDay(String Day )
		{
			txtBrithDay.clear();
			txtBrithDay.sendKeys(Day);
			
		}
		
		public void clickradio()
		{
			clickradio.click();
			
		}
		
		public void clickcheckbox()
		{
			clickcheckbox.click();
			
		}
		
		public void clickjoinbox()
		{
			clickjoinbox.click();
			
		}
			
	}
	

	


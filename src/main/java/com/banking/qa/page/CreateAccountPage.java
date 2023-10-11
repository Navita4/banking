package com.banking.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.base.Base;

public class CreateAccountPage extends Base{
	
	@FindBy(xpath="//input[@name='account_number']")
	WebElement account_number;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name='middlename']")
	WebElement middle_name;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//button[@id='generate_pass']")
	WebElement code_generate_button;
	
	@FindBy(xpath="//input[@name='pin']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement opening_balance;
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-2']")
	WebElement save_button;
	
	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyTheAccountCreationFunctionality()
	{
		account_number.sendKeys("5145484515");
		first_name.sendKeys("Asmita");
		middle_name.sendKeys("Pratim");
		last_name.sendKeys("Bansod");
		email.sendKeys("asmitap@gmail.com");
		code_generate_button.click();
		pin.sendKeys("1234");
		 opening_balance.sendKeys("45000");
		 save_button.click();
		
	}

}

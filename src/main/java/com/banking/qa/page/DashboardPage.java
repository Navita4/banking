package com.banking.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.base.Base;

public class DashboardPage extends Base{
	
	@FindBy(xpath="//a[@class='nav-link tree-item nav-accounts nav-transactions nav-manage_account']")
	WebElement account_management;
	
	
	@FindBy(xpath="//p[contains(text(),'New Account')]")
	WebElement new_account;
	
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCreateNewAccountOption()
	{
		account_management.click();
		new_account.click();
	}

}

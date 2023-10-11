package com.banking.qa.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.page.DashboardPage;
import com.banking.qa.page.LoginPage;

public class DashboardPageTest extends Base{
	
	LoginPage loginPage;
    DashboardPage  dashboardPage;
	
	
	
	public DashboardPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage= new LoginPage();
		loginPage.verifyLoginWithValidCredential();
		dashboardPage= new DashboardPage();
		
	}
	
	@Test
	public void verifyCreateNewAccountOptionTest()
	{
		dashboardPage.verifyCreateNewAccountOption();
	}
}

package com.banking.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.page.CreateAccountPage;
import com.banking.qa.page.DashboardPage;
import com.banking.qa.page.LoginPage;

public class CreateAccountPageTest extends Base {
	
	LoginPage loginPage;
    DashboardPage  dashboardPage;
    CreateAccountPage createAccountPage;
	
	
	
	public CreateAccountPageTest()
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
		dashboardPage.verifyCreateNewAccountOption();
		createAccountPage= new CreateAccountPage();
	}
	
	@Test
	public void verifyTheAccountCreationFunctionalityTest()
	{
		createAccountPage.verifyTheAccountCreationFunctionality();
	
	}

}

package com.banking.qa.test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.page.LoginPage;

public class LoginPageTest extends Base{
	LoginPage loginPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage= new LoginPage();
	}
	
	@Test
	public void verifyLoginWithValidDataTest()
	{
		loginPage.verifyLoginWithValidCredential();
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}

}

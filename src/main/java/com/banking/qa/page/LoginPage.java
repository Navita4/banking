package com.banking.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.base.Base;

public class LoginPage extends Base
{
    @FindBy(xpath="//input[@name='username']")
    WebElement userName;
    
    @FindBy(xpath="//input[@name='password']")
    WebElement pass;
    
    @FindBy(xpath="//button[@type=submit']")
    WebElement loginButton;
    
    
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void verifyLoginWithValidCredential()
    {
    	userName.sendKeys(prop.getProperty("userId"));
    	pass.sendKeys(prop.getProperty("password"));
    	loginButton.click();
    }
}

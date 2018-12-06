package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class login extends TestBase{
	
	@FindBy(xpath="//*[@id='mat-input-0']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login-form']/form/button")
	WebElement login;
	
	//Initializing the page object
	public login(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public HomePage loginCred(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}

}

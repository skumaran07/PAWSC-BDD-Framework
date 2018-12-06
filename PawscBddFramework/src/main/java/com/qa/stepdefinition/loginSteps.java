package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.login;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps extends TestBase{
	
	login loginPage;
	HomePage homePage;
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Exception {
		TestBase.initialization();
	    
	}

	@When("^enter username and password for login$")
	public void enter_username_and_password() throws Exception {
		
		//homePage = new HomePage();
		loginPage = new login();		 
		homePage = loginPage.loginCred(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(7000);
	   
	}

	@Then("^validate the home page title$")
	public void validate_the_home_page_title() throws Exception {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("PAWSC", homeTitle);
	 
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Exception {
	   TestBase.shutdown();
	}


}

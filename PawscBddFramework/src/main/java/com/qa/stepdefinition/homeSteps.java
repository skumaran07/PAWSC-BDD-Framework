package com.qa.stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.pages.login;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class homeSteps extends TestBase{
	
	login loginPage;
	HomePage homePage = new HomePage();
	WebDriverWait wait ;
	
	@Given("^open the browser$")
	public void user_open_the_browser() throws Exception {
		TestBase.initialization();
	    
	}

	@When("^username and password for login$")
	public void enter_username_and_password() throws Exception {
		
		//homePage = new HomePage();
		loginPage = new login();		 
		homePage = loginPage.loginCred(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(10000);
	   
	}
	
	@Then("^Select Site inforamtion under Sites$")
	public void select_Site_inforamtion_under_Sites() throws Exception {
	    homePage.clickSites();
	}
	
	@Then("^validate home page title$")
	public void validate_the_home_page_title() throws Exception {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("NAWSC", homeTitle);
	 
	}
	

	@Then("^Check Site search button is displaying in landing page$")
	public void check_Site_list_text_is_displaying_in_banner() throws Exception {
		
		Thread.sleep(5000);
		String buttonText1 = homePage.checkProfileText();
		
		Assert.assertEquals(buttonText1, "tokay test");
	 
	}

	@Then("^close browser$")
	public void close_browser() throws Exception {
		TestBase.shutdown();
	}
	
	@Then("^Select Ambridge-Action from dataset$")
	public void click_dataset_dropdown() throws Exception {
		
		Thread.sleep(5000);
		homePage.selectDataSet();
		
		homePage.clickNewSiteButton();
	   
	}

	@Then("^Validate create site title$")
	public void validate_create_site_title() throws Exception {
		//Thread.sleep(5000);
		String bannerTxt = homePage.bannerTextCreateSite();
		Assert.assertEquals("Create Site", bannerTxt);
	   
	}

}

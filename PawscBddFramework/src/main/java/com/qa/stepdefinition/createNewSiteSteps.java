package com.qa.stepdefinition;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.pages.createNewSite;
import com.qa.pages.login;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class createNewSiteSteps extends TestBase {
	
	login loginPage;
	HomePage homePage = new HomePage();
	createNewSite createNS = new createNewSite();
	WebDriverWait wait ;
	
	

	@Then("^Enter the value into all the fields$")
	public void enter_the_value_into_all_the_fields() throws Exception {
		createNS.enterValues();
		
	 
	}

	@Then("^Click create button$")
	public void click_create_button() throws Exception {
		
		createNS.clickCreatbtn();
	}


}

package com.qa.stepdefinition;

import com.qa.pages.techInfoPage;
import com.qa.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class techInfostep extends TestBase{
	
	techInfoPage techInfo = new techInfoPage();
	
	
	@Then("^Select Technical inforamtion menu from  left navigation$")
	public void select_Technical_inforamtion_menu_from_left_navigation() throws Exception {
		
		techInfo.techInfoMenu();
		Thread.sleep(7000);
		String BnrTxt = techInfo.techInfoBannerText();
		Assert.assertEquals("Technical Information", BnrTxt);
		System.out.println("Technical Information page has opened" +BnrTxt);
	    
	}

	@SuppressWarnings("deprecation")
	@When("^Check the Device Type tab is selected$")
	public void check_the_Device_Type_tab_is_selected() throws Exception {
		
		techInfo.devTypeTabSelect();
		
		
		
		
	    
	}

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class createNewSite extends TestBase{
	
	@FindBy(xpath="//*[@id='mat-input-9']")
	WebElement siteTypeTest;
	
	@FindBy(xpath="//*[@id='mat-input-10']")
	WebElement siteUseTest;
	
	@FindBy(xpath="//*[@id='mat-input-11']")
	WebElement contactAddress;
	
	@FindBy(xpath="//*[@id='mat-input-12']")
	WebElement company;
	
	@FindBy(xpath="//*[@id='mat-input-17']")
	WebElement phoneNo;
	
	@FindBy(xpath="//*[@id='wrapper']/div/fuse-content/app-site-create/div/div[2]/form/div[2]/div/button")
	WebElement createBtn;
	
	
	//Initializing the page object
			public createNewSite(){
				PageFactory.initElements(driver, this);
			}
			
	public void enterValues() throws Exception{
		
		Thread.sleep(5000);
		siteTypeTest.clear();
		siteTypeTest.sendKeys("Technology");
		siteUseTest.clear();
		siteUseTest.sendKeys("Test1");
		contactAddress.clear();
		contactAddress.sendKeys("New Jersey");
		company.clear();
		company.sendKeys("xyz water purify");
		phoneNo.clear();
		phoneNo.sendKeys("9876545676");
		
	}
	
	public void clickCreatbtn() throws Exception{
		
		Thread.sleep(5000);
		createBtn.click();
		
	}	
			

}

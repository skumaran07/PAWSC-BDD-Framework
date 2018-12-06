package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class techInfoPage extends TestBase{
	
	@FindBy(xpath = "/html/body/fuse-root/fuse-main/mat-sidenav-container/mat-sidenav-content/div/div/fuse-sidebar/fuse-navbar/div/div[2]/fuse-navigation/div/fuse-nav-vertical-group/div[2]/fuse-nav-vertical-item[2]/a/span")
	WebElement techInfoMenu;
	
	@FindBy(xpath="//*[@id='wrapper']/div/fuse-content/app-technnical/div/div[1]/div/div")
	WebElement techInfobannerText;
	
	@FindBy(xpath="//*[@id='mat-tab-label-0-0']/div")
	WebElement deviceTypeTab;
	
	@FindBy(xpath="//*[@id='mat-tab-label-0-1']/div")
	WebElement technicianTab;
	
	
	
	
	
	//Initializing the page object
	public techInfoPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void techInfoMenu(){
		techInfoMenu.click();
	}
	
	
	public String techInfoBannerText(){
		
		String bannerText = techInfobannerText.getText();
		return bannerText;
		
	}
	
	public void devTypeTabSelect(){
		
		Boolean tabSelect = deviceTypeTab.isSelected();
		if(tabSelect = false){
			System.out.println("Device Type tab has auto selected");}
			else{
			System.out.println("Device Type tab not auto selected");
		}
		//return tabSelect;
	}

}

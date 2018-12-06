package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//*[@id='main-navigation']/fuse-nav-vertical-group/div[2]/fuse-nav-vertical-collapse[1]/div/fuse-nav-vertical-item[1]/a/span")
	WebElement siteInformation;
	
	//@FindBy(xpath = "/html/body/fuse-root/fuse-main/mat-sidenav-container/mat-sidenav-content/div/div/div/fuse-toolbar/mat-toolbar/div/div[2]/button/span/div/span")
	
	@FindBy(xpath="//*[@id='wrapper']/div/fuse-toolbar/mat-toolbar/div/div[2]/button/span/div/span")
	WebElement profileText;
	
	@FindBy(xpath = "//*[@id='main-navigation']/fuse-nav-vertical-group/div[2]/fuse-nav-vertical-item[2]/a/span")
	WebElement techInformation;
	
	@FindBy(xpath = "//*[@id='wrapper']/div/fuse-content/app-technnical/div/div[1]/div/div")
	WebElement tiBannerText;
	
	@FindBy(xpath = "//*[@id='wrapper']/div/fuse-content/app-sitelist/div/div[2]/div/form")
	WebElement advancedPanel;
	
	@FindBy(className = "mat-form-field-infix")
	WebElement datasetField;
	
	@FindBy(xpath = "//*[@id='cdk-overlay-2']/div")
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@id='wrapper']/div/fuse-content/app-sitelist/div/div[2]/div/div/a/mat-icon")
	WebElement newsiteButton;
	
	@FindBy(xpath="/html/body/fuse-root/fuse-main/mat-sidenav-container/mat-sidenav-content/div/div/div/fuse-content/app-site-create/div/div[1]/div/div")
	WebElement createSiteText;
	
	@FindBy(xpath = "//*[@id='mat-option-1']/span")
	WebElement secondOption;
	
	@FindBy(xpath = "//*[@id='main-navigation']/fuse-nav-vertical-group/div[2]/fuse-nav-vertical-collapse[1]/a/span")
	WebElement navSites;
	
	//Initializing the page object
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			
			String title = driver.getTitle();
			return title;
		}
		
		public String checkProfileText() throws InterruptedException{
			/*Actions ac = new Actions(driver);
			ac.moveToElement(siteSearchButton).build().perform();*/
			Thread.sleep(5000);
			String siBanner = profileText.getText();
			return siBanner;
		}
		
		public void clickSites() throws InterruptedException{
			navSites.click();
			Thread.sleep(7000);
			siteInformation.click();
		}
		
		public void selectDataSet() throws Exception{
			
			Thread.sleep(5000);
			//WebElement dataSet = driver.findElement(By.className("mat-form-field-infix"));
			datasetField.click();
			Thread.sleep(5000);
			System.out.println("dropdown is opened");
			//WebElement menuPopup = driver.findElement(By.xpath ("//*[@id='mat-option-1']/span"));//*[@id="cdk-overlay-4"]/div/div
			Actions ac = new Actions(driver);
			ac.moveToElement(secondOption).click();
			ac.build().perform();
			
			Thread.sleep(3000);
		}
		
		public void clickNewSiteButton(){
			newsiteButton.click();
		}
		
		public String bannerTextCreateSite() throws Exception{
			Thread.sleep(5000);
			String bannerText = createSiteText.getText();
					return bannerText;
		}
		

}

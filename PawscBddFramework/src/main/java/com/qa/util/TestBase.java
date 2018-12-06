package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\WMS\\workspace\\PawscBddFramework\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e){
			e.getMessage();
		}
	}
	
	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
	}
	
	public static void shutdown(){
		driver.close();
	}

}

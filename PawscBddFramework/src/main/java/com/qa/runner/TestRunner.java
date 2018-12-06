package com.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\WMS\\workspace\\PawscBddFramework\\src\\main\\java\\com\\qa\\Features\\techInfo.feature",
glue = {"com.qa.stepdefinition"},
plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
monochrome = true, //display the console output in proper readable format
strict = true, //it will check if any steps not defined in step definition
dryRun = false  //Check mapping is proper between the feature and stepdefinition file
)

public class TestRunner {
	/*@BeforeClass
	public static void setup() {
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    extentProperties.setReportPath("output/report.html");
	    extentProperties.setExtentXServerUrl("http://localhost:1337");
	    extentProperties.setProjectName("MyProject");
	}
	@AfterClass
	public static void reportStartUp(){
		Reporter.loadXMLConfig(new File("src/main/java/com/qa/Features/extent-config.xml"));	
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 7");
		Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	}*/

}


//"C:\\Users\\WMS\\workspace\\PawscBddFramework\\src\\main\\java\\com\\qa\\Features\\login.feature",
//"C:\\Users\\WMS\\workspace\\PawscBddFramework\\src\\main\\java\\com\\qa\\Features\\home.feature"
//C:\\Users\\WMS\\workspace\\PawscBddFramework\\src\\main\\java\\com\\qa\\Features\\Createsite.feature
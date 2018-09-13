package com.Cogniphi.School;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UTILITY.BaseClass;
import UTILITY.SafeActions;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class LogInPage extends BaseClass{
	
public static final Logger log = Logger.getLogger(LogInPage.class.getName());
	SafeActions action;
	
	void login() {
		action = new SafeActions(driver);
		
		action.enter_text_in_texbox(By.xpath(reader.get("username_xpath")), reader.get("UserName"), "UserName");
		log.info("Username Entered");		
		action.enter_text_in_texbox(By.xpath(reader.get("userpwd_xpath")), reader.get("Password"), "Password");
		log.info("Password entered");
		action.click_on_the_field(By.xpath(reader.get("LogIn_xpath")), "LoginButton", 1000);	
		log.info("Clicked on Login button");
		action.maximise();
	}
	
	 void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		log.info("chrome browser Launched");
		driver.get(reader.get("TestURL"));
	}
	
	 void openFirefoxBrowser() {
		
		driver = new FirefoxDriver();
		log.info("chrome browser Launched");
		driver.get(reader.get("TestURL"));
	}
	 
	 public void chromeLogin() {
		
		 openChromeBrowser();		 
		 driver.findElement(By.xpath(reader.get("username_xpath"))).clear();
		 login();
	 }
	 
	 public void firefoxLogin() {
		 openFirefoxBrowser();
		 login();
	 }
	

}

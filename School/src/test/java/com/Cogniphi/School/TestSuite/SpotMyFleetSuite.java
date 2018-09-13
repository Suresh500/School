package com.Cogniphi.School.TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Cogniphi.School.LogInPage;

import UTILITY.BaseClass;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class SpotMyFleetSuite extends BaseClass {
LogInPage login ;
	@Test(groups = { "Sanity", "Regression" })
	public void TC_001_verifyVehiclesAndTrips() throws InterruptedException {
		

	}

	@BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		login = new LogInPage();		
		login.chromeLogin();
	}

	@AfterTest
	public void afterClass() {
		driver.quit();
	}
	
}

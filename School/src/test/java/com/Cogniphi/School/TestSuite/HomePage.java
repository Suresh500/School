package com.Cogniphi.School.TestSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Cogniphi.School.LogInPage;

import UTILITY.BaseClass;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class HomePage extends BaseClass {

	@Test(groups = { "Sanity", "Regression" })
	public void TC_001_verify_Attendance_DetailsPage() throws InterruptedException {
		

	}

	

	@BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		LogInPage.chrome_LogIn();
	}

	@AfterClass
	public void afterClass() {
		// BaseClass.closeBrowser();
	}
}

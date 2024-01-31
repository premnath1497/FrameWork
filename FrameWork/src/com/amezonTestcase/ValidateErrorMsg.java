package com.amezonTestcase;

import com.UtilityAmezon.HelperAmezon;
import com.UtilityAmezon.TestDataAmezon;
import com.pom.HomePage_PageObjects;
import com.pom.SignInPage_PageObjects;

public class ValidateErrorMsg {

	public static void main(String[] args) throws InterruptedException {
	
		HelperAmezon.launchBrowser(TestDataAmezon.amezonUrl);
		Thread.sleep(3000);
		new HomePage_PageObjects().clickOnSignInBtn();
		Thread.sleep(3000);
	    new SignInPage_PageObjects().sendMobileNumber();
	    new SignInPage_PageObjects().clickOnContinuebtn();

	}

}

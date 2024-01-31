package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.UtilityAmezon.HelperAmezon;

public class SignInPage_PageObjects {

	public WebElement mobileInputTextField() {
		WebElement mobiletextbox=HelperAmezon.driver.findElement(By.xpath("//input[@type='email']"));
		return mobiletextbox ;
	}
	
	public void sendMobileNumber() {
		mobileInputTextField().sendKeys("8381067443");
	}

	public WebElement continuebtn() {
		WebElement continueButton=HelperAmezon.driver.findElement(By.id("continue"));
		return continueButton ;
	}
	
	public void clickOnContinuebtn() {
		continuebtn().click();
	}
}

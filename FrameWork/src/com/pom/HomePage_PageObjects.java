package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.UtilityAmezon.HelperAmezon;

public class HomePage_PageObjects {
	
	public WebElement signinbtn() {
		WebElement signin=HelperAmezon.driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		return  signin;
	}
	
	public void clickOnSignInBtn() {
		signinbtn().click();
	}

}

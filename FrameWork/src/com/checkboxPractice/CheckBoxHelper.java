package com.checkboxPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxHelper {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement option1=driver.findElement(By.xpath("//input[@value='Option 1']"));
		option1.click();
		
		boolean optionselected=option1.isSelected();
		if(optionselected) {
			System.out.println("Radiobtn is Selected");
		}
		else {
			System.out.println("RadioBtn is not Selected");
		}
		
		boolean isdisplayed=option1.isDisplayed();
		if(isdisplayed) {
			System.out.println("Radiobtn is Displayed");
		}
		else {
			System.out.println("RadioBtn is Not Displayed");
		}
		
		boolean isEnabled=option1.isEnabled();
		if(isEnabled) {
			System.out.println("Radiobtn is Enabled");
		}
		else {
			System.out.println("Radiobtn is Not Enabled");
		}
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='checkbox1']"));
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is Selected");
		}else {
			System.out.println("Checkbox is Not Selected");
		}
		
		if(checkbox.isDisplayed()) {
			System.out.println("Checkbox is Displayed");
		}else {
			System.out.println("Checkbox is Not Displayed");
		}
		
		if(checkbox.isEnabled()) {
			System.out.println("Checkbox is Displayed ");
		}else {
			System.out.println("Checkbox is Not Displayed");
		}
		
		List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<allcheckbox.size(); i++) {
			allcheckbox.get(i).click();
		}
	}
	
}

package com.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.business.Helper;
import com.business.TestData;

public class FirstScript {

	public static void main(String[] args) {

/*		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mohitkumar3019.graphy.com/");

		driver.manage().window().maximize();
		
		String actualTitleOfPage=driver.getTitle();
		
		System.out.println(actualTitleOfPage);
		
		String expectedTitle="Mohit TechHub";
		
		if(actualTitleOfPage.equals(expectedTitle)) {
			System.out.println("Title is Matched & Test Case is Passed");
		}
		else {
			System.out.println("Title is Not Matched & Test Case is Failed");
		}

		driver.close(); */
		
		Helper.launchBrowser(TestData.techHubUrl);
		Helper.validateTitleOfPage(TestData.expectedTitleOfPage);
		Helper.validateCurrentUrlOfPage(TestData.expectedUrlOfPage);
		new Helper().closeBrowser();
	}

}

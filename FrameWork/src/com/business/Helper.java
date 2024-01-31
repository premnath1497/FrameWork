package com.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
		
	}

	/**
	 * This Method is used to getTitle of Page
	 * @param  None
	 * @return None
	 * @author 1
	 * @exception None
	 */
	public static String getTitleOfPage() {
		String getTitle=driver.getTitle();
		return getTitle;
		
	}
	
	/**
	 * This Method is used to verify Title of Page
	 * @param  None
	 * @return None
	 * @author 1
	 * @exception None
	 */
	
	public static String validateTitleOfPage(String expectedTitleOfPage) {
		
		String actualTitleofPage=getTitleOfPage();
		if(actualTitleofPage.equals(TestData.expectedTitleOfPage)) {
			System.out.println("Title is Matched & Test Case is Passed");
		}
		else {
			System.out.println("Title is Not Matched & Test Case is Failed");
		}
		return actualTitleofPage;
		
	}
	
	/**
	 * This Method is used to getCurrentUrl of Page
	 * @param  None
	 * @return None
	 * @author 1
	 * @exception None
	 */
	public static String getCurrentUrlOfPage() {
		String getCurrentUrlOfPage=driver.getCurrentUrl();
		return getCurrentUrlOfPage;
		
	}
	
	/**
	 * This Method is used to verify Current Url of Page
	 * @param  None
	 * @return None
	 * @author 1
	 * @exception None
	 */
	
	public static String validateCurrentUrlOfPage(String expectedUrlOfPage) {
		
		String actualCurrentUrlOfPage=getCurrentUrlOfPage();
		if(actualCurrentUrlOfPage.equals(TestData.expectedUrlOfPage)) {
			System.out.println("Current Url is Matched & Test Case is Passed");
		}
		else {
			System.out.println("Current Url is Not Matched & Test Case is Failed");
		}
		return actualCurrentUrlOfPage;
		
	}
	
	/**
	 * This Method is used to close the Browser
	 * @param  None
	 * @return None
	 * @author 1
	 * @exception None
	 */
	
	public void closeBrowser() {
		driver.close();
	}
	
}

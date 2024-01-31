package com.UtilityAmezon;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HelperAmezon {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
        driver = new FirefoxDriver();
		driver.get(url);
        driver.manage().window().maximize();
		
	}

}

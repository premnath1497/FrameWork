package org.techpanda.live.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.techpanda.live.test.TestDatalivetech;

public class HelperTechlive {
	
	public static WebDriver driver;

	public static void launchBrowser(String url) {
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	public static String getTitleOfpage() {
		String gettitle=driver.getTitle();
		return gettitle;
	}
	
	public static String validateTitleOfHomePage(String expecredTitle) {
		String actualGetTitle=getTitleOfpage();
		System.out.println(actualGetTitle);
		if(actualGetTitle.equalsIgnoreCase(expecredTitle)) {
			System.out.println("HomePageTitle is Mathced & Test Case Passed");
		}
		else {
			System.out.println("HomePageTitle is Not Mathced & Test Case Failed");
		}
		return actualGetTitle;
	}
	
	public static String textOfHomePage(String strtextxpath) {
		String gettextofHomePage=driver.findElement(By.cssSelector(strtextxpath)).getText();
		return gettextofHomePage;
	}
	
	public static String validateTextOfHomePage(String strTextxpathele,String expectedText ) {
		String actualTextOfHomePage=textOfHomePage(strTextxpathele);
		System.out.println(actualTextOfHomePage);
		
		if(actualTextOfHomePage.equalsIgnoreCase(expectedText)) {
			System.out.println("TextOfHomePage is Mathced & Test Case Passed");
		}
		else {
			System.out.println("TextOfHomePage is Not Mathced & Test Case Failed");
		}
		return actualTextOfHomePage;
	}
	
	public static void clickOnMobileBtn(String strXpath) {
		driver.findElement(By.xpath(strXpath)).click();
	}

	public static void dropdownSelect(String dropdownxpath,String textindropdown) {
		
		Select s=new Select(driver.findElement(By.xpath(dropdownxpath)));
		s.selectByVisibleText(textindropdown);
		
	}
	
	public static void screenshot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String timeStamp = sdf.format(d);
        File destination = new File("C:\\Users\\1\\Automation\\FrameWork\\Screenshot" + timeStamp + ".png");
        FileHandler.copy(source, destination);
	}
}

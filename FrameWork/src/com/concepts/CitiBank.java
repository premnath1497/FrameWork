package com.concepts;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBank {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\Testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.online.citibank.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement popup1=driver.findElement(By.id("pop1img"));
        WebElement popup2= driver.findElement(By.xpath("//img[@id='pop2img']"));
      
        if(popup1.isDisplayed()) {
        	driver.findElement(By.xpath("//div[@id='popup1']/div/a")).click();
        }
        
        if(popup2.isDisplayed()) {
        	driver.findElement(By.xpath("//div[@id='popup2']/div/a")).click();
        }
        
        String titleOfMainWindow=driver.getTitle();
        System.out.println(titleOfMainWindow);
        
        String mainWindow= driver.getWindowHandle();
        
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        
        ArrayList<String> childWindow=new ArrayList<String>(driver.getWindowHandles());
        String childWindows=childWindow.get(1);
        driver.switchTo().window(childWindows);
        String titleOfChildWindow=driver.getTitle();
        System.out.println(titleOfChildWindow);
        
        driver.switchTo().window(mainWindow);
        String titleOfMainWindowAfterSwitch=driver.getTitle();
        System.out.println(titleOfMainWindowAfterSwitch);
        
	}

}

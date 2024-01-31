package com.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
//	    driver.get("https://letcode.in/frame");
	    //Switch to Require Frame
//	    driver.switchTo().frame("mce_0_ifr");
//	    
//	    driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
	    
//	    WebElement name= driver.findElement(By.xpath("//body[@id='tinymce']"));
//	    
//	    name.sendKeys("Premnath");
	    
//	    driver.switchTo().frame(0);
//	    driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
	    
//	    driver.switchTo().frame("firstFr");
//	    
//	    driver.findElement(By.name("fname")).sendKeys("Premnath");
//	    
//	    driver.findElement(By.name("lname")).sendKeys("Suryawanshi");
//	    
//	   WebElement childframe=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
//	    
//	    driver.switchTo().frame(childframe);
//	    
//	    driver.findElement(By.name("email")).sendKeys("Prem@123");
	    
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
	    // Switch To Parent Top Frame
	    driver.switchTo().frame("frame-top");
	    // Switch To Parent Left Frame
	    driver.switchTo().frame("frame-left");
	    String left= driver.findElement(By.xpath("//body")).getText();
	    System.out.println(left);
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame-middle");
	    String middle= driver.findElement(By.xpath("//body")).getText();
	    System.out.println(middle);
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame-right");
	    String right= driver.findElement(By.xpath("//body")).getText();
	    System.out.println(right);
	   
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame-bottom");
	    String bottom= driver.findElement(By.xpath("//body")).getText();
	    System.out.println(bottom);
	}

}

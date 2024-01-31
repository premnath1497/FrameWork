package com.concepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\Testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement searchBox=driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys("java");
        List<WebElement> allElement=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
       // System.out.println(allElement.size());
        
        for(int i=1; i<allElement.size();i++) {
        	if(allElement.get(i).getText().equalsIgnoreCase("java")) {
        		allElement.get(i).click();
        		break;
        	}
        }
        
        WebElement link=driver.findElement(By.xpath("//h3[text()='Java Tutorial']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", link);
        
        String expectedTitle="Java Tutorial";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)) {
        	System.out.println("Test Case Is Passed");
        }
        else {
        	System.out.println("Test Case Is Failed");
        }
        driver.close();
	}

}

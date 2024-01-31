package com.amezonTestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleText {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("present");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li//descendant::div[@class='wM6W7d']"));
		
		System.out.println(list.size());
		

	}

}

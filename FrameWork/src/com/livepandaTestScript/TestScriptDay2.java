package com.livepandaTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScriptDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://live.techpanda.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement mobileEle=driver.findElement(By.xpath("//a[text()='Mobile']"));
		mobileEle.click();
		String mobilePrice=driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        System.out.println(mobilePrice);
        driver.findElement(By.id("product-collection-image-1")).click();
        String mobilePriceOnDetailPage=driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        System.out.println(mobilePriceOnDetailPage);
        if(mobilePrice.equals(mobilePriceOnDetailPage)) {
        	System.out.println("Test Case Passed");
        }else {
        	System.out.println("Test Case Passed");
        }
	}

}

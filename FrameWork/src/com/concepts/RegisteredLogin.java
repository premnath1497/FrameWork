package com.concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisteredLogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//label[text()='Email Address']//following-sibling::div")).sendKeys("prem");

	}

}

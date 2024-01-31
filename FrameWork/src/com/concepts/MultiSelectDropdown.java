package com.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
	
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://omayo.blogspot.com/");
	    
    //  WebElement button=driver.findElement(By.xpath("//button[@name='submit']"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        js.executeScript("window.scrollBy(0,250)", "");
        
        //js.executeScript("arguments[0].scrollIntoView();",button);
        
        WebElement dropdownEle= driver.findElement(By.id("drop1"));
       
        Select s=new Select(dropdownEle);
        
        WebElement firstElementOption=s.getFirstSelectedOption();
        
        System.out.println(firstElementOption.getText());
        
        List<WebElement> allOptions=s.getOptions();
        
        System.out.println(allOptions.size());
        
        for(WebElement ele:allOptions) {
        	
        	System.out.println(ele.getText());
        }
        
       WebElement textField= driver.findElement(By.id("ta1"));
       
       JavascriptExecutor js1=(JavascriptExecutor)driver;
       
       js1.executeScript("arguments[0].value='King'",textField );
       
       WebElement multiSelectDropDown=driver.findElement(By.id("multiselect1"));
        
       Select sm = new Select(multiSelectDropDown);
       
       List<WebElement> multiSelect=sm.getOptions();
       
       for(WebElement ele1:multiSelect) {
       	
       	ele1.click();
       }
       
       boolean l = sm.isMultiple();
       
       System.out.println(l);
       
       driver.close();
       
       
    

	}

}

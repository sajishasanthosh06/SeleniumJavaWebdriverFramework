package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Locators {
    public static void main(String[] args) throws InterruptedException {	
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://practicetestautomation.com/practice-test-login/"); 
    	Thread.sleep(3000);
    	driver.manage().window().maximize();
    	
    	// Finding web element using Xpath
    	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
       
    	
    	//Finding  web element using id
    	driver.findElement(By.id("username")).sendKeys("student");
    	Thread.sleep(2000);
    	driver.findElement(By.id("password")).sendKeys("Password123");
    	Thread.sleep(2000);
    	driver.findElement(By.id("submit")).click();
    	Thread.sleep(2000);
    	driver.close();

    	//finding web element using class name
    	driver.findElement(By.className("btn")).click();
    	Thread.sleep(2000);
    	driver.close();
    	
    	//finding web element using tag name
    	driver.findElement(By.tagName("button")).click();
    	Thread.sleep(2000);
    	driver.close();
    	
    	// finding web element using Link Text
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver1 = new ChromeDriver();
    	driver1.get("https://the-internet.herokuapp.com/");
    	driver1.findElement(By.linkText("Dropdown")).click();
    	Thread.sleep(2000);
	
	   //finding web element using partial link text
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver2 = new ChromeDriver();
	   driver2.get("https://the-internet.herokuapp.com/");
	   driver2.findElement(By.partialLinkText("DropDown")).click();
	   Thread.sleep(2000);
	
   
   }
    

}

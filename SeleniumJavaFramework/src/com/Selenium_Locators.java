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
	
	// Find element using Xpath
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
    Thread.sleep(2000);
    driver.findElement(By.id("submit")).click();
    Thread.sleep(2000);
	driver.close();
	
	//Find Element using id
	//driver.findElement(By.id("username")).sendKeys("student");
	//Thread.sleep(2000);
	//driver.findElement(By.id("password")).sendKeys("Password123");
	//Thread.sleep(2000);
	//driver.close();
   
   }
    

}

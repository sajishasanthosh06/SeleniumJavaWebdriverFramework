package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Function {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(("https://www.globalsqa.com/demo-site/select-dropdown-menu/"));
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement drpdwn = driver.findElement(By.tagName("select"));
	// Select class object creation for drop down  value selection
	Select item = new Select(drpdwn);
	// Select drop down item by index 
	item.selectByIndex(10);
	// select drop down item by visible text
	item.selectByVisibleText("Maldives");
	// Select drop down value by value 
	item.selectByValue("IND");
		
	
	}

}

package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StroringLocatorstoVariable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"username\"]"));
		//New method to re use the webelemnt by storing in to a variable
		WebElement locator = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		locator.sendKeys("sajisha");
		
		

	}

}

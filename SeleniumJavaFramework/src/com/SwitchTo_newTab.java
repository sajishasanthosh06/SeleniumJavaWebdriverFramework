package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_newTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// To switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://chatgpt.com/c/69b161e8-0ca8-8324-a030-5560c2db74a9");
		Thread.sleep(2000);
		driver.get("https://github.com/sanjanagawali/Selenium-Project/blob/master/Selenium_Mini_Project/test-output/passed.png");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		//To close current tab
		driver.close();
		// To close the browser
		driver.quit();
        
	}

}

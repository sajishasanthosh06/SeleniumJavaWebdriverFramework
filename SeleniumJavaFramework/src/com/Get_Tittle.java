package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Tittle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String Tittle = driver.getTitle();
		System.out.print("Title is  : " + Tittle);
		
		Thread.sleep(3000);
		
	}

}

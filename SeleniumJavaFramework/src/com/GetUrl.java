package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup(); //Setting up the driver automatically
		 WebDriver driver = new ChromeDriver();  // declaring webdriver object 
		driver.get("https://web.whatsapp.com/"); //fetching the given URL

        //WebDriverManager.edgedriver().setup();  // setup Edge driver
        // WebDriver driver = new EdgeDriver();    // open Edge browser
        // driver.get("https://www.google.com");   // open website
        
		//WebDriverManager.firefoxdriver().setup(); // Setting up firefox  driver automatically
	    // WebDriver driver = new FirefoxDriver(); // firefox driver object declaration
		//driver.get("https://web.whatsapp.com/");// fetching the given url
		//Thread.sleep(5000);
		//driver.get("https://www.manoramaonline.com/");
		
		Thread.sleep(5000);
		String title = driver.getTitle();
        System.out.println("The title is : " + title);
        
        //   driver.manage().window().maximize();  // Screen maximizing
        //  Thread.sleep(5000);
        // driver.manage().window().minimize();  //screen minimizing
        Thread.sleep(5000);
        
        driver.manage().window().fullscreen(); // full screen view
        Thread.sleep(2000);
        // way 1 to set diemnsion
        // org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(500, 700);
        // driver.manage().window().setSize(dimension); // setting screen diemnsion
        // way 2 to set screen dimension
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(800,1000)); 
        
		
        
        
		}	
	  
}



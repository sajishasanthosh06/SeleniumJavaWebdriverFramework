package com;

import java.awt.desktop.QuitEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7363541497118729821&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9153119&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // Navigate to another URL
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);
        //Go back to the previous URL
        driver.navigate().back(); 
        Thread.sleep(3000);
        // Move forward in browser History
        driver.navigate().forward();
        Thread.sleep(5000);
        // To Refresh the current page
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
        
        
	}

}

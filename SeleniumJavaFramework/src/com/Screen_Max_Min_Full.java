package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Screen_Max_Min_Full {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7363541497118729821&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9153119&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		String Tittle = driver.getTitle();
		System.out.print("Title is : " + Tittle);
		Thread.sleep(5000);
		//driver.manage().window().maximize(); // window maximizing
		//driver .manage().window().minimize(); // window minimizing
		driver.manage().window().fullscreen(); // window full screen 
		Thread.sleep(3000);
	}

}

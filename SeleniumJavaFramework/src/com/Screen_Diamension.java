package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Diamension {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7363541497118729821&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9153119&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");;
		//1 method to set screen dimension
       // org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(500, 700);
        // driver.manage().window().setSize(dimension); // setting screen diemnsion
		//2 method to set screen dimension
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(800,1000));
	}

}

package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Multiple_Url {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup(); // Chrome setting automatically
	WebDriver driver = new ChromeDriver(); // webdriver object declaration
	Thread.sleep(5000);
	WebDriver driver1 = new ChromeDriver();
	WebDriver driver2 = new ChromeDriver();
	driver.get("https://www.meta.com/en-gb/facebook-app/?srsltid=AfmBOorMnvkIjyGkWELxQ8yyn1tQv5MlO5ynpUYpJDyupyNz-w3AbeFg"); //Fetching FB
	Thread.sleep(5000);
    driver1.get("https://www.amazon.com/"); // Fetching Amazon
    Thread.sleep(5000);
	driver.get("https://www.flipkart.com/");  //  fetching flipcart 
	Thread.sleep(5000);
	driver.quit();
	}

}

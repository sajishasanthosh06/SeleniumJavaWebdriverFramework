package Work;

import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProject2 {

	public static void main(String[] args) throws InterruptedException {
		// Simple project for username and password passing
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println("The title is : " +Title);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		//Method 1 to pass username and password 
		//WebElement username = driver.findElement(By.id("user-name"));
		//username.sendKeys("standard_user");
		//Thread.sleep(2000);
		//WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		//Thread.sleep(2000);
		//WebElement login = driver.findElement(By.id("login-button"));
        //login.click();
		// Method 2 to pass username and password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        // Scrolling down the page 
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)");
        //Thread.sleep(2000);
        //Scrooling down to add to cart button
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // WebElement item = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        //js.executeScript("arguments[0].scrollIntoView(true);", item);
        //Thread.sleep(2000);
        //item.click();
       //Using wedriverWait method 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //Waiting for web element to load 
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-onesie")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", item);

        js.executeScript("arguments[0].click();", item);

        System.out.println("Item added to cart");

	}

}

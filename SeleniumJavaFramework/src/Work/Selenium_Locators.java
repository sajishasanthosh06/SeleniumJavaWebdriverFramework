package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sajisha");
		driver.findElement(By.id("lastName")).sendKeys("KS");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("sajishasanthosh06@gmail.com");
		driver.findElement(By.id("gender-radio-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.className(" mr-sm-2 form-control")).clear();
		driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("6 February 1996");
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("06 February 1996");
		

	}

}

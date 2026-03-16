package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProject1 {

	public static void main(String[] args) throws InterruptedException {
		// Simple project for user name and password passing
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));
		loginButton.click();
		Thread.sleep(3000);
	}

}

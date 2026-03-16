package Work;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Project1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.navigate().to("https://chatgpt.com/");
		driver.manage().window().setSize(new Dimension(300, 500));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().back();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://qavbox.github.io/demo/signup/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("uname")).sendKeys("Sajisha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.id("tel")).sendKeys("12345678");
		Thread.sleep(2000);
		// Scroll down the page 
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ip")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.quit();	
	}
	
}
	
	
	
		

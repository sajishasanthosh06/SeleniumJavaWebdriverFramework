package Automation_Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CURA_Healthcare_Service {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.print(" The page title is : " + title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();
		//driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//driver.quit();
		// Login page 
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
		Thread.sleep(2000);
		driver.findElement(By.id("btn-login")).click();
		Thread.sleep(2000);
		// Booking Appointment page
		WebElement drpdwn= driver.findElement(By.id("combo_facility"));
		Select value = new Select(drpdwn) ;
		Thread.sleep(2000);
		value.selectByValue("Hongkong CURA Healthcare Center");
		Thread.sleep(2000);
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"radio_program_medicaid\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_visit_date")).sendKeys("25/03/2026");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).sendKeys("First time Visit ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-toggle\"]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("rofile")).click();
	}

}

package tekpyramid.demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_DWS_001_Test {
	
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		if (driver.getTitle().equals("Demo Web Shop. Register")) {
			   driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			   driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
			   driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vineeth Kumar");
			   driver.findElement(By.xpath("//input[@id='LastName']")).clear();
			   driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Chandrasekaran");
			   driver.findElement(By.xpath("//input[@id='Email']")).clear();
			   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vineethkumar2797@gmail.com");
			   driver.findElement(By.xpath("//input[@id='Password']")).clear();
			   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vineeth2797");
			   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
			   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Vineeth2797");
			   driver.findElement(By.xpath("//input[@id='register-button']")).click();
		} else {
            System.out.println("Click on Register Link");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}

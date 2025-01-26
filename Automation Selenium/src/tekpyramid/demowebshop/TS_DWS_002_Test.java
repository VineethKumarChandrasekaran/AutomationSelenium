package tekpyramid.demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_DWS_002_Test {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		if (driver.getTitle().equals("Demo Web Shop. Login")) {
			driver.findElement(By.xpath("//input[@id='Email']")).clear();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vineethkumar2797@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).clear();
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vineeth2797");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			if (driver.findElement(By.xpath("//a[@class='account']")).getText().equals("vineethkumar2797@gmail.com")) {
				System.out.println("Login Successful");
			}
		} else {
               System.out.println("Click on the Login Link");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

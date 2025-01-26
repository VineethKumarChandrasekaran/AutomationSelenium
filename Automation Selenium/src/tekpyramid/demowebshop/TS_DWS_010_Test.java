package tekpyramid.demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_DWS_010_Test {
	@Test
	public void books() {
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
				driver.findElement(By.xpath("//a[contains(text(),'Tricentis')]")).click();
				if (driver.getTitle().equals("Demo Web Shop. Tricentis")) {
					System.out.println("Tricentis page has been Displayed Successfully");
				} else {
					System.out.println("Click on Tricentis Link");
				}
			}
		} 
		driver.manage().window().minimize();
		driver.quit();
	}

}

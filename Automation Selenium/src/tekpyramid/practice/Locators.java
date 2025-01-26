package tekpyramid.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		if (driver.getTitle().equals("Demo Web Shop. Register")) {
			driver.findElement(By.cssSelector("input[id='gender-male']")).click();
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(Keys.chord("Vineeth Kumar"), Keys.TAB,
					Keys.chord("Chandrasekaran"), Keys.TAB, Keys.chord("vineethkumar2797@gmail.com"), Keys.TAB, Keys.chord("Vineeth2797"), Keys.TAB,
					Keys.chord("Vineeth2797"), Keys.TAB, Keys.ENTER);
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//li[text()='The specified email already exists']")).getText());
		} else {
			System.out.println("Click on the Register Link");
		}

		driver.manage().window().minimize();
		driver.quit();

	}

}

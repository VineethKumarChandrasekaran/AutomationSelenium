package tekpyramid.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimePicker {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
        driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
        driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
        driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
        driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@class,'MuiInputBase')]")).click();
        action.click(driver.findElement(By.xpath("//span[text()='7']"))).perform();
        action.click(driver.findElement(By.xpath("//span[text()='15']"))).perform();
        action.click(driver.findElement(By.xpath("//span[text()='PM']"))).perform();
        action.click(driver.findElement(By.xpath("//button[text()='OK']"))).perform();
	}

}

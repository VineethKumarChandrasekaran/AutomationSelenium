package tekpyramid.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
    System.out.println("Switched to 1st Frame");
    driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='form_container']/iframe")));
    System.out.println("Switched to 2nd Frame");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
    driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
    driver.switchTo().defaultContent();
    System.out.println("Switched back to Main Page");
	}

}

package tekpyramid.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		SearchContext shadowhost = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		System.out.println("Host:"+shadowhost);
		Thread.sleep(2000);
		shadowhost.findElement(By.cssSelector("input[type='text']")).sendKeys("Vineeth Kumar");
	}

}

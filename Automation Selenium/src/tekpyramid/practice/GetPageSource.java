package tekpyramid.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
        System.out.println(driver.getPageSource());
        driver.manage().window().minimize();
        driver.quit();
	}

}

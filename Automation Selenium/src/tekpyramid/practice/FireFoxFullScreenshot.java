package tekpyramid.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxFullScreenshot {

	public static void main(String[] args) throws IOException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.co.in/");
    File temp = driver.getFullPageScreenshotAs(OutputType.FILE);
    File file = new File("./file1.png");
    FileUtils.copyFile(temp, file);
    driver.manage().window().minimize();
    driver.quit();
	}
}

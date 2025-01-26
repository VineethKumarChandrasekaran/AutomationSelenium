package tekpyramid.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demowebshop.tricentis.com/");
        WebElement computers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Computers')])[1]")));
        action.moveToElement(computers).perform();
        WebElement desktops = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Desktops')])[1]")));
        action.moveToElement(desktops).click().perform();
        driver.manage().window().minimize();
        driver.quit();
    }
}

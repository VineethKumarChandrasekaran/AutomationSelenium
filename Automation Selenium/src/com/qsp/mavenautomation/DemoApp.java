package com.qsp.mavenautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		String productname = "SAMSUNG Galaxy";
		System.out.println("The Discount value of the product is "+ driver.findElement(By.xpath("//th[text()='" + productname + "']/parent::tr/td[3]")).getText());
		driver.manage().window().minimize();
		driver.quit();
	}

}

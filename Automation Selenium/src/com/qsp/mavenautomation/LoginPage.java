package com.qsp.mavenautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	String expectedUrl = "https://www.amazon.in/";
	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	System.out.println("The Actual URL is " + driver.getCurrentUrl());
	System.out.println("The Actual Title is " + driver.getTitle());
	if (driver.getCurrentUrl().equals(expectedUrl)&&driver.getTitle().equals(expectedTitle)) 
	{
			System.out.println("The URL & Title is Verified and Found Correct");
		} 
	else {
			System.out.println("The URL & Title is Verified and Found Incorrect");	
	}
	driver.navigate().to("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/gp/new-releases/?ref_=nav_cs_newreleases");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/amazonpay/home?ref_=nav_cs_apay");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	}

}

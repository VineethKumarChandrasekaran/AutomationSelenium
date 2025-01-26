package com.qsp.mavenautomation;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.myntra.com/");
    String[]urls= {"https://www.myntra.com/shop/men","https://www.myntra.com/shop/women","https://www.myntra.com/shop/kids"};
    for(String url : urls)
    {
    	driver.switchTo().newWindow(WindowType.WINDOW);
    	driver.get(url);
    }
     Set<String> allwid = driver.getWindowHandles();
     System.out.println(allwid.size());
     for(String wid : allwid)
     {
    	 String widTitle = driver.switchTo().window(wid).getTitle();
    	 System.out.println("widTitle = "+widTitle);
    	 if(widTitle.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
    	 {
    		String parentWidUrl = driver.getCurrentUrl();
    		System.out.println("Parent Window URL = "+parentWidUrl);
    	 }
    	 else if(widTitle.equals("Men Shopping Online - Shop for Mens Clothing & Accessories in India | Myntra"))
    	 {
    		 int childWindowX = driver.manage().window().getPosition().getX();
    		 System.out.println("Child Window X Axis Position = "+childWindowX);
    		 int childWindowY = driver.manage().window().getPosition().getY();
    		 System.out.println("Child Window Y Axis Position = "+childWindowY);
    	 }
    	 else if(widTitle.equals("Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More"))
    	 {
    		 int childWindowHeight = driver.manage().window().getSize().getHeight();
    		 System.out.println("Child Window Height = "+childWindowHeight);
    		 int childWindowWidth = driver.manage().window().getSize().getWidth();
    		 System.out.println("Child Window Width = "+childWindowWidth);
    	 }
    	 else
    	 {
    		 Dimension defineSize = new Dimension(500, 700);
    		 driver.manage().window().setSize(defineSize);
    		 Point definePosition = new Point(180, 170);
    		 driver.manage().window().setPosition(definePosition);
    	 }
     }
     driver.quit();
	}

}

package com.driver.basicOperaations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		System.out.println("**********Navigate to Google**********");
		driver.get("https://www.google.com");
		System.out.println("Current Title - " + driver.getTitle());
		
		
		System.out.println("**********Navigate to Guru99**********");
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Current Title - " + driver.getTitle());
		
		System.out.println("**********Navigate to Back**********");
		driver.navigate().back();
		System.out.println("Current Title - " + driver.getTitle());
		
		System.out.println("**********Navigate to Forword**********");
		driver.navigate().forward();
		System.out.println("Current Title - " + driver.getTitle());
		
		driver.navigate().refresh();
		

	}
}

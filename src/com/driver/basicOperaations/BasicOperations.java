package com.driver.basicOperaations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		System.out.println("Position " + driver.manage().window().getPosition());
		System.out.println("Size " + driver.manage().window().getSize());
		//Maximize Window
		driver.manage().window().maximize();
		System.out.println("Size " + driver.manage().window().getSize());	
		
		
		//Deal with window Title
		String strTitle = driver.getTitle();
		System.out.println("Browser Title is - " + strTitle);
		System.out.println("Title length is  - " + strTitle.length());
		if(strTitle.equals("Google"))
			System.out.println("Title matches Google");
		else
			System.out.println("Title is not matching, current title is "+strTitle);
		
		
		//Dealing with browser URL
		String strURL = driver.getCurrentUrl();
		System.out.println("Browser URL is - " + strURL);
		
		//Dealing with Page Source
		String strPageSource = driver.getPageSource();
		System.out.println("\n\n\n\n\n*********Page source is *********\n" + strPageSource);
	//	System.out.println(strPageSource);
		
		
		//Close or Quit browser
		driver.close();
		
		//driver.quit();
		
		
	}

}

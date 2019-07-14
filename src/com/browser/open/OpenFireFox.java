package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\JarFiles\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		System.out.println("End Of Test Case");
	}

}

package com.driver.basicOperaations;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalWaits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 	
		WebDriver driver = new ChromeDriver();
		//15 sec
		driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.quit();
		
		
	}

}

package com.ScreenPrints;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenPrint {
	
	public static void main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		try{
			TakesScreenshot tk = (TakesScreenshot) driver;
			File Src = tk.getScreenshotAs(OutputType.FILE);
			File dest = new File("F:\\Selenium\\Doccuments\\a.jpg");
			FileUtils.copyFile(Src, dest);
		}catch(Exception ex)
		{
			
		}
		driver.quit();
	}

}

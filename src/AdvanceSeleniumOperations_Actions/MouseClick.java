package AdvanceSeleniumOperations_Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseClick {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		Actions action=new Actions(driver);
		Action rightClick = action.contextClick().build();
		rightClick.perform();
		
		Thread.sleep(5000);
		
		WebElement ele5000 =  driver.findElement(By.xpath("//*[@data-id='2']"));
		Action doubleClick = action.doubleClick(ele5000).build();
		doubleClick.perform();
	}

}

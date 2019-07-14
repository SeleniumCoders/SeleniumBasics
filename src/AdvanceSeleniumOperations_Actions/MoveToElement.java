package AdvanceSeleniumOperations_Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement ele5000 =  driver.findElement(By.xpath("//*[@data-id='2']"));
		Action mouseOver = action.moveToElement(ele5000).build();
		mouseOver.perform();
		
		Thread.sleep(5000);
	}

}

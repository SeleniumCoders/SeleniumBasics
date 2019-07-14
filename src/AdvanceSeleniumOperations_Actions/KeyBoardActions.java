package AdvanceSeleniumOperations_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action action = builder.moveToElement(email)
						.click()
						.keyDown(email,Keys.SHIFT)
						.sendKeys(email,"test")
						.keyUp(email,Keys.SHIFT)
						.doubleClick()
						.contextClick()
						.build();
		
		action.perform();
	}
}

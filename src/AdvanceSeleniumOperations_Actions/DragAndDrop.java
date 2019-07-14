package AdvanceSeleniumOperations_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
        WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));

		Thread.sleep(5000);
		Actions action=new Actions(driver);
		Action dragAndDrop = action.dragAndDrop(sourceLocator,targetLocator).build();
		dragAndDrop.perform();
	}

}

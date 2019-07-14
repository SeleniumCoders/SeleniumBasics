package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		//Switch by index
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
        WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));

		Thread.sleep(5000);
		Actions action=new Actions(driver);
		Action dragAndDrop = action.dragAndDrop(sourceLocator,targetLocator).build();
		dragAndDrop.perform();

		
		
		
	}

}

package BasicElementOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {

		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		WebElement radio = driver.findElement(By.id("exp-0"));
		
		System.out.println("Is Selected - " + radio.isSelected());
		System.out.println("Is Enabled - " + radio.isEnabled());
		System.out.println("Is Displayed - " + radio.isDisplayed());
		
		System.out.println("Select Radio");
		radio.click();
		System.out.println("\n\nIs Selected - " + radio.isSelected());
		driver.quit();
	}
}

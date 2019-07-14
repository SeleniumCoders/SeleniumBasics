package BasicElementOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		WebElement checkbox = driver.findElement(By.id("profession-1"));
		
		System.out.println("Is Selected - " + checkbox.isSelected());
		System.out.println("Is Enabled - " + checkbox.isEnabled());
		System.out.println("Is Displayed - " + checkbox.isDisplayed());
		
		//Recommended way
		if(checkbox.isSelected()!=true)
		{
			System.out.println("Selecting check box");
			checkbox.click();
		}else
		{
			System.out.println("alredy selected");
		}
		System.out.println("\n\n Is Selected - " + checkbox.isSelected());
		
		//Recommended way
		if(checkbox.isSelected()!=true)
		{
			System.out.println("Selecting check box");
			checkbox.click();
		}else
		{
			System.out.println("alredy selected");
		}
		System.out.println("\n\n Is Selected - " + checkbox.isSelected());
		
		driver.quit();
	}

}

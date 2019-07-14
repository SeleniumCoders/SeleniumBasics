package BasicElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		
		Select obj = new Select(driver.findElement(By.name("selenium_commands")));
		
		//check is Multiple 
		System.out.println("Is Multiple - " + obj.isMultiple());
		
		//Select Multiple Values
		obj.selectByIndex(1);
		obj.selectByIndex(3);
		obj.selectByVisibleText("Browser Commands");
		
		
		System.out.println("******Get Selected values");
		List<WebElement> selectedlist = obj.getAllSelectedOptions();
		for(WebElement option:selectedlist)
		{
			System.out.println(option.getText());
		}
		
		//deselect
		obj.deselectByIndex(3);
		System.out.println("*****Get Selected values after deslecting index 3");
		List<WebElement> selectedlist1 = obj.getAllSelectedOptions();
		for(WebElement option:selectedlist1)
		{
			System.out.println(option.getText());
		}
		
		//Deselect By Text
		obj.deselectByVisibleText("Browser Commands");
		System.out.println("*****Get Selected values after deslecting by text");
		List<WebElement> selectedlist2 = obj.getAllSelectedOptions();
		for(WebElement option:selectedlist2)
		{
			System.out.println(option.getText());
		}
		
		
		//Deselect all
		obj.deselectAll();
		System.out.println("*****Get Selected values after deslecting all");
		List<WebElement> selectedlist3 = obj.getAllSelectedOptions();
		for(WebElement option:selectedlist3)
		{
			System.out.println(option.getText());
		}
		
		driver.quit();
	}

}

package BasicElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://www.gcrit.com/build3/create_account.php");
		driver.manage().window().maximize();
		
		
		
		Select obj = new Select(driver.findElement(By.name("country")));
		
		//check is Multiple 
		System.out.println("Is Multiple - " + obj.isMultiple());
		
		//Check selection
		//WebElement selection= obj.getFirstSelectedOption();
		//selection.getText();
		System.out.println("What is selected by default - " + obj.getFirstSelectedOption().getText());
		
		//Select by Value
		obj.selectByValue("2");
		System.out.println("After Select by value 2 -" + obj.getFirstSelectedOption().getText());	
		
		//Select by Text
		obj.selectByVisibleText("India");
		System.out.println("after Selecct by visible text - " + obj.getFirstSelectedOption().getText());
		
		//Select by Index
		obj.selectByIndex(3);
		System.out.println(" after Select by Index 3 " + obj.getFirstSelectedOption().getText());
		
		
		
		//Get List of available Options
		System.out.println("List of values");
		List<WebElement> list = obj.getOptions();
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}

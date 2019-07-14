package BasicElementOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	
	public static void main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.name("firstname"));
		
		//check default value is empty
		System.out.println("Is Enabled - " + textBox.isEnabled());
		System.out.println("Is Displayed - " + textBox.isDisplayed());
		
		String defaultValue = textBox.getAttribute("value");
		if(defaultValue.isEmpty())
			System.out.println("Default value is empty");
		else
			System.out.println("Default value is not empty");
		
		
		//Set value
		textBox.sendKeys("Kiran");
		String value = textBox.getAttribute("value");
		System.out.println("Value entered is " + value);
		
		//Clear value
		textBox.clear();
		String value1 = textBox.getAttribute("value");
		System.out.println("Value entered is " + value1);
		
		driver.quit();
	}

}

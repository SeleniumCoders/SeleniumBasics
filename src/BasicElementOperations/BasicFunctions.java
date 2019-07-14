package BasicElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		if(driver.findElement(By.xpath("//strong[text()='PERSONAL INFORMATION']")).isDisplayed())
			System.out.println("Displayed");
		else
			System.out.println("Not Displayed");
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("FirstName");
		String label = driver.findElement(By.xpath("//*[@name='firstname']/../strong")).getText();
		if(label.equals("First name:"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//*[@name='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		driver.findElement(By.xpath("//*[@id='profession-1']")).click();
		
		String lvalue= driver.findElement(By.xpath("//*[@name='lastname']")).getAttribute("value");
		System.out.println(lvalue);
		
		driver.quit();
		
		
		
	}
}

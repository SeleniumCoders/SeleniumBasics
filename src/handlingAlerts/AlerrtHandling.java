package handlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlerrtHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("submit")).click();
		
		//Switch to allert and dismiss it
		Alert alertBox = driver.switchTo().alert();
		System.out.println("Alert box text " + alertBox.getText());
		alertBox.dismiss();				
		driver.switchTo().defaultContent();
		
		//Switch to alert and accept it
		driver.findElement(By.name("submit")).click();
		alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		//Switch 2nd alert and accept it
		alertBox = driver.switchTo().alert();
		System.out.println("Alert box text " + alertBox.getText());
		alertBox.accept();
		
		//Switch back to default DOM
		driver.switchTo().defaultContent();
		
	}

}

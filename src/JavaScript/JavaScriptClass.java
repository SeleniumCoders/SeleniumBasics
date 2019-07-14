package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		
		
		js.executeScript("document.getElementById('email').value='email';");
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value='passwprd';",pass);
		
		
		js.executeScript("alert('Welcome To JS');");
	}
}

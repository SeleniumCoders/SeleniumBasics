package WindowsHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//Get Current window Handle ID
		String curWindow = driver.getWindowHandle();
		Set<String> windowsList1 = driver.getWindowHandles();
		System.out.println("No Of Open Windows - " + windowsList1.size());
		System.out.println("Default Window Handle - " + curWindow);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		
		//Get list of windows
		Set<String> windowsList2 = driver.getWindowHandles();
		System.out.println("\n\n\nNo Of Open Windows after click - " + windowsList2.size());
		System.out.println("List of Window Handles");
		for(String windowHandle:windowsList2)
			System.out.println(windowHandle);
		
		//Switch to new window
		Thread.sleep(1000);
		for(String windowHandle:windowsList2)
		{
			if(!windowHandle.equalsIgnoreCase(curWindow))
				driver.switchTo().window(windowHandle);
		}
		
		//Enter value in new window
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		
		Thread.sleep(5000);
		//Close Last window
		driver.close();
		Thread.sleep(5000);
		
		//Switch back to default
		//driver.switchTo().defaultContent();
		driver.switchTo().window(curWindow);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		
		//Close all Windows
		driver.quit();
		
	}
}

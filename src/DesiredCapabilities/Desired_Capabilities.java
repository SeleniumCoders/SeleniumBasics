package DesiredCapabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Desired_Capabilities {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver","F:\\Selenium\\JarFiles\\IEDriverServer.exe");  
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get("https://google.com");
		
		
		Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getPlatform());
		System.out.println(cap.getVersion());
		
		System.out.println("End Of Test Case");
		

	}

}

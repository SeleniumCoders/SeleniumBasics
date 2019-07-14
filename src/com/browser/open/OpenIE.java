package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenIE {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver","F:\\Selenium\\JarFiles\\IEDriverServer.exe");  
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		System.out.println("End Of Test Case");
		

	}

}

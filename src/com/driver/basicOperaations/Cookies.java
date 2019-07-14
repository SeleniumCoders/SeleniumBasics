package com.driver.basicOperaations;

import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;		

public class Cookies{	
    

    public static void main(String[] args)		
    {
    	WebDriver driver;	
    	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\JarFiles\\chromedriver.exe"); 				
		driver=new ChromeDriver();        
		driver.get("https://www.google.com");

		
		 // loop for getting the cookie information 
		System.out.println("-----------List Of All Cookies------------------\n\n\n\n");
		Set<Cookie> liistOfCookies = driver.manage().getCookies();
        for(Cookie ck : liistOfCookies)							
        {			
           System.out.println((ck.getName()+" *******"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
        }
        System.out.println("-----------END------------------\n\n\n\n");
        
        // loop for getting the cookie information 
        driver.manage().deleteAllCookies();
 		System.out.println("-----------List Of All Cookies after delete all------------------\n");
         for(Cookie ck : driver.manage().getCookies())							
         {			
            System.out.println((ck.getName()+" *******"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
         }			
         System.out.println("-----------END------------------\n\n\n\n");
         
        //Add Cookies
        Cookie c = new Cookie("new", "Testing");
        driver.manage().addCookie(c);
        
        // loop for getting the cookie information 	
        System.out.println("-----------List Of All Cookies after  Add Cookie New:Testing------------------\n");
        for(Cookie ck : driver.manage().getCookies())							
        {			
           System.out.println((ck.getName()+" *******"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
        }
        System.out.println("-----------END------------------\n\n\n\n");
        
        //delete Cookie
         driver.manage().deleteCookie(c);
        // loop for getting the cookie information 		
        System.out.println("-----------List Of All Cookies after Delete Cookie New:Testing------------------\n");
        for(Cookie ck : driver.manage().getCookies())							
        {			
           System.out.println((ck.getName()+" *******"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
        }
        System.out.println("-----------END------------------\n\n\n\n");
        
        driver.close();
    }
    
}
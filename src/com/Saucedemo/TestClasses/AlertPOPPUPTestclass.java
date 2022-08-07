package com.Saucedemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Saucedemo.POMClasses.AlertPOMClass;

public class AlertPOPPUPTestclass {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\SOFTWARE TESTING\\SELENIUM DOWNLOADS\\ChromeDriver_Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is Opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		driver.get("https://demoqa.com/alerts");
		System.out.println("URL is Opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		AlertPOMClass x = new AlertPOMClass(driver);
		x.alertPoPuphandle();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		x.alertText();
		String expectedtext= "Click me";
		String actualText = x.alertText();
		if(expectedtext.equals(actualText))
		{
			System.out.println("TC is Passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

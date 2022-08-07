package com.Saucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.POMClasses.HomePagePOMClass;
import com.Saucedemo.POMClasses.LoginPagePOMClass;
import com.Saucedemo.UtillityClasses.TakeScreenshot;

public class TestBaseClass2 {
	
	WebDriver driver;
	
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws InterruptedException, IOException
	{
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\SOFTWARE TESTING\\SELENIUM DOWNLOADS"
				+ "\\ChromeDriver_Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\SOFTWARE TESTING\\SELENIUM DOWNLOADS"
				+ "\\MozillaFirefox_Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}	
		
		
		System.out.println("Browser is Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Opened");
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		lp.sendUsername();
		System.out.println("Enter the Username");
		lp.sendPassword();
		System.out.println("Enter the Password");
		lp.ClickLoginButton();
		System.out.println("Click on Login Button");
		Thread.sleep(5000);
		TakeScreenshot.TakeScreenshot(driver);	
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.SideButton();
		System.out.println("Side Button is Clicked");
		hp.LogOutButton();
		System.out.println("Logoutbutton is Clicked");
		driver.quit();
		System.out.println("Browser is closed");
	}
}
	
	
	
	
	
	
	
	
	



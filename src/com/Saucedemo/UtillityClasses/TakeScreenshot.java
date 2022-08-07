	package com.Saucedemo.UtillityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	public static void TakeScreenshot(WebDriver driver) throws IOException
	{
		
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING\\Automation Screenshot\\POM Screenshot\\pomfile"+date+".jpg");
		FileHandler.copy(sourcefile, destfile);
		System.out.println("Screenshot is TAKEN");
	}

}

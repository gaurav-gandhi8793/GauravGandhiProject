package com.Saucedemo.POMClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPOMClass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='alertButton']")
	WebElement alertPopUp;
	public void alertPoPuphandle()
	{
		alertPopUp.click();
	}
	
	public String alertText()
	{
		return alertPopUp.getText();
	}
	
	
	
	
	public AlertPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	
	
	
	
	
	
	
	
	
	
}

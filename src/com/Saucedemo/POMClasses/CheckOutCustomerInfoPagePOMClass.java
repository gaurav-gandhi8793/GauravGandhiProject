package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCustomerInfoPagePOMClass {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void firstnametextfield()
	{
		firstname.sendKeys("Gaurav");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void Lastnametextfield()
	{
		lastname.sendKeys("Gandhi");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	public void PostalCodetextfield()
	{
		postalcode.sendKeys("431122");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	public void Continuebutton()
	{
		continuebutton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelbutton;
	public void CancelButton()
	{
		cancelbutton.click();
	}
	
	public CheckOutCustomerInfoPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	

}

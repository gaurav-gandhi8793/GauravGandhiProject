package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass {
	
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removebutton;
	public void RemoveButton()
	{
		removebutton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continuebutton;
	public void ContinueButton()
	{
		continuebutton.click();
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutbutton;
	public void CheckOutButton()
	{
		checkoutbutton.click();
	}
	
	
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

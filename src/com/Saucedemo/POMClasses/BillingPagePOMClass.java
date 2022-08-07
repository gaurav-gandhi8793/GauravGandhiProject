package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagePOMClass {
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finishButton;
	public void FinishButton()
	{
		finishButton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelButton;
	public void CanCelButton()
	{
		cancelButton.click();
	}
	
	public BillingPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	

}

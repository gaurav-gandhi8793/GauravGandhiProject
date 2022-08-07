package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletePagePOMClass {
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement backhomebutton;
	public void BackHomeButton()
	{
		backhomebutton.click();
	}
	
	public OrderCompletePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}

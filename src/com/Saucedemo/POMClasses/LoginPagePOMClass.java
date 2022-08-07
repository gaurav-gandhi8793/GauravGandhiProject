package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass {
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	
//	public void ClickLoginButton()
//	{
//		loginbutton.click();
//	}
	
	//By using mouse actions
	
	public void ClickLoginButton()
	{
		act.click(loginbutton).perform();
	}
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	
	

}

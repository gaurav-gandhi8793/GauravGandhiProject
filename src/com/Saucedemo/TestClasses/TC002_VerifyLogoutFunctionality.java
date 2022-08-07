package com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMClass;

public class TC002_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void VerifyLogoutFunctionality() 
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.SideButton();
		System.out.println("Click On SideButton");
		hp.LogOutButton();
		System.out.println("Click on Logout button");
		
		System.out.println("Applying the Validation");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("TestCase is Passed");
		}
		else
		{ 
			System.out.println("TestCase is Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.Saucedemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TC001_VerifyLoginPageFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality()
	{
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL,ExpectedURL);
		System.out.println("Assertion is Passed");
		
	}

}

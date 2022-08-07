package com.Saucedemo.TestClasses;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMClass;
import com.Saucedemo.UtillityClasses.TakeScreenshot;

public class TC004_VerifyAddToCartFunctionalityForAllProducts extends TestBaseClass2
{
	@Test
	public void VerifyAddToCartFunctionalityForAllProducts() throws IOException 
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.AllItemsAddToCart();
		System.out.println("All Items Added To Cart");
		
		hp.ShoppingCartButton();
		System.out.println("Shopping cart Opened");
		hp.ShoppingCartBadge();
		TakeScreenshot.TakeScreenshot(driver);
		System.out.println("Applying the validation");
		hp.getTextofCart();
		String actualText = hp.getTextofCart();
		String expectedtext = "6";
	    Assert.assertEquals(actualText, expectedtext);
	    System.out.println("Assertion is Passed");
		
		
	}

}

package com.Saucedemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMClass;

public class TC003_VerifyAddToCartFunctionalityFor1Product extends TestBaseClass2
{
	@Test
	public void VerifyAddtoCartFunctionalityfor1Product() 
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.BikelightAddToCart();
		System.out.println("Bike light Added to Cart");
		hp.ShoppingCartButton();
		System.out.println("Shopping cart Opened");
		hp.ShoppingCartBadge();
		System.out.println("Applying the validation");
		hp.getTextofCart();
		String actualText = hp.getTextofCart();
		String expectedtext = "1";
		Assert.assertEquals(actualText, expectedtext);
	}

	
	
}

package com.Saucedemo.TestClasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMClass;



public class TC005_VerifyUserAbleToApplyFilter extends TestBaseClass2
{
	
	@Test
	public void Applyfilter()
	{
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.FilterButton();
		System.out.println("Filter is Selected");
		System.out.println("Applying The Validation");
		String expectedText = "Price (low to high)";
		String actualText = hp.lowtohighfilter();
		System.out.println(actualText);
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Assertions is passed");
			
	}

}

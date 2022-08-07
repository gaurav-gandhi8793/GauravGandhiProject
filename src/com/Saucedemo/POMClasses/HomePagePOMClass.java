package com.Saucedemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass {
	
	private WebDriver driver;
	 private Select s;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagpackaddtocart;
	public void ClickBagpackAddToCart()
	{
		bagpackaddtocart.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement bikelightaddtocart;
	public void BikelightAddToCart()
	{
		bikelightaddtocart.click();
		
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement boltTshirtAddToCart;
	public void BoltTshirtAddTocart()
	{
		boltTshirtAddToCart.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
	private WebElement fleecejacketAddToCart;
	public void FleecejacketAddTocart()
	{
		fleecejacketAddToCart.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
	private WebElement OnesieAddToCart;
	public void onesiejacketAddTocart()
	{
		OnesieAddToCart.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[6]")
	private WebElement redTshirtaddtocart;
	public void RedTshirtAddToCart()
	{
		redTshirtaddtocart.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	private WebElement selectBagpack;
	public void SelectBagPack()
	{
		selectBagpack.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[2]")
	private WebElement selectBikelight;
	public void SelectBikelight()
	{
		selectBikelight.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[3]")
	private WebElement selectBoltTShirt;
	public void SelectBoltTshirt()
	{
		selectBoltTShirt.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[4]")
	private WebElement selectfleecejacket;
	public void SelectFleecejacket()
	{
		selectfleecejacket.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement shoppingcartbadge;
	public void ShoppingCartBadge()
	{
		shoppingcartbadge.click();
	}
	public String getTextofCart()
	{
	   return shoppingcartbadge.getText();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[5]")
	private WebElement selectonesie;
	public void SelectOneSie()
	{
		selectonesie.click();
	}

	@FindBy(xpath="(//div[@class='inventory_item_name'])[6]")
	private WebElement selectredTshirt;
	public void SelectRedTshirt()
	{
		selectredTshirt.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allitemAddtoCart;
	public void AllItemsAddToCart()
	{
		for(WebElement i:allitemAddtoCart)
		{
			i.click();
		}
	}
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Sidebutton;
	public void SideButton()
	{
		Sidebutton.click();
	}
	
	@FindBy(xpath="//a[text()='All Items']")
	private WebElement allitemsbutton;
	public void AllItemsButton()
	{
		allitemsbutton.click();
	}
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement aboutbutton;
	public void AboutButton()
	{
		aboutbutton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	public void LogOutButton()
	{
		logoutbutton.click();
	}
	
	@FindBy(xpath="//a[text()='Reset App State']")
	private WebElement resetappstatebutton;
	public void ResetAppStateButton()
	{
		resetappstatebutton.click();
	}
	
	@FindBy(xpath="//button[text()='Close Menu']")
	private WebElement closebutton;
	public void CloseButton()
	{
		closebutton.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement Shoppingcartbutton;
	public void ShoppingCartButton()
	{
		Shoppingcartbutton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterbutton;
	public void FilterButton()
	{
		filterbutton.click();
		s.selectByVisibleText("Price (low to high)");
	}
	
	@FindBy(xpath="//option[@value='lohi']")
	private WebElement lowtohighfilter;
	public String lowtohighfilter()
	{
		return lowtohighfilter.getText();
		
	}
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		s=new Select(filterbutton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

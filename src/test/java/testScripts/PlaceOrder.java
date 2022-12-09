package testScripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckoutPage;
import pages.HomePage;
import pages.SearchItemPage;
import pages.ShoppingCartPage;

public class PlaceOrder extends TestBase{
	
	// Perform SearchItem, AddItemtoCard, CheckOut
	
	HomePage homePage;
	SearchItemPage searchPage;
	ShoppingCartPage shoppingcartPage;
	CheckoutPage checkoutPage;
	
  @Test(priority = 1)
  public void searchItemTest() {
	  initialize();
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
  }  
  
  @Test(priority = 2)
  public void searchItemPageTest() {
	  searchPage = new SearchItemPage();
	  searchPage.selectItem();
	  searchPage.addItemtoCart();  
  }
  
  @Test(priority = 3)
  public void ShoppingCartPageTest() {
	  shoppingcartPage = new ShoppingCartPage();
	  shoppingcartPage.checkoutItems();
  }
  
  @Test(priority = 3)
  public void CheckoutItemTest() {
	  checkoutPage = new CheckoutPage();
	  checkoutPage.checkoutItem("Mahantesh","Borgi","Jetty","403804","Vasco");
	  
  }

  
  
  
}

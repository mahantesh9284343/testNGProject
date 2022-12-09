package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase {
	
	//Actions - ApplyCoupan, EmptyCart,  CheckOut
	
	//Page Factory
	@FindBy(xpath = "//button[contains(text(), 'Checkout')]")
	WebElement chkoutbtn;
	
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutItems() {
		chkoutbtn.click();
	}
	
}

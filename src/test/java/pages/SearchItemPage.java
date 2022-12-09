package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchItemPage extends TestBase {
	//Page Factory
	@FindBy(css = "ul > li.preview")
	WebElement item;
	
	@FindBy(css = "div.detail-wrapper > button.call-to-action")
	WebElement btnAddToCart;
	
	public SearchItemPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() {
		item.click();
	}
	
	public void addItemtoCart() {
		btnAddToCart.click();
	}
}

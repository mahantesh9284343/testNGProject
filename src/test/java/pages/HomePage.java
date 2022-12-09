package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	//Page Factory
	@FindBy(name="searchbar")
	WebElement srchBar;

	@FindBy(id="button-search")
	WebElement srchBtn;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="signup")
	WebElement signupBtn;
	
	@FindBy(id="cart")
	WebElement viewCart;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String strBook) {
		srchBar.sendKeys(strBook);
		srchBtn.click();
	}
		
}

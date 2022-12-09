package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase {
	
	//Actions - ApplyCoupan, EmptyCart,  CheckOut
	
	//Page Factory
	@FindBy(id="s-name")
	WebElement chkoutname;
	
	@FindBy(id="s-surname")
	WebElement chkoutsurname;
	
	@FindBy(id="s-address")
	WebElement chkoutaddress;
	
	@FindBy(id="s-zipcode")
	WebElement chkoutzip;
	
	@FindBy(id="s-city")
	WebElement chkoutcity;
	
	@FindBy(id="single")
	WebElement sglpkgbtn;
	
	@FindBy(xpath = "//button[contains(text(), 'Buy')]")
	WebElement buybtn;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutItem(String strname, String strsurname, String straddress, String strzip, String strcity) {
		chkoutname.sendKeys(strname);
		
	}
	
}

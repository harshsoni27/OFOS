package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNPaypage extends BasePage{

	public OrderNPaypage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[text()='Cash on Delivery']")
	WebElement CashOnDelivery;
	
	@FindBy(xpath="//input[@value=\"Order Now\"]")
	WebElement OrderNowButton;

	public WebElement getCashOnDelivery() {
		return CashOnDelivery;
	}

	public WebElement getOrderNowButton() {
		return OrderNowButton;
	}

}

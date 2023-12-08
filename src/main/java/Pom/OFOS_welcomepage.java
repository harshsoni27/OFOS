package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFOS_welcomepage extends BasePage{
	public OFOS_welcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Home ")
	WebElement HomeLink;
	
	@FindBy(xpath="//a[text()='Restaurants ']")
	WebElement RestaurantLink;
	
	@FindBy(linkText="Login")
	WebElement LoginLink;
	
	@FindBy(linkText="Register")
	WebElement RegisterLink;
	
	@FindBy(xpath="(//a[text()='Order Now'])[1]")
	WebElement orderNowButton;

	public WebElement getOrderNowButton() {
		return orderNowButton;
	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public WebElement getRestaurantLink() {
		return RestaurantLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	

}

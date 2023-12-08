package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NorthStreetTavernPage extends BasePage{

	public NorthStreetTavernPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText="Yorkshire Lamb Patties")
	WebElement YorkshireLambPatties;
	
	@FindBy(linkText="Lobster Thermidor")
	WebElement LobsterThermidor;
	
	@FindBy(linkText="Stuffed Jacket Potatoes")
	WebElement StuffedJacketPatatoes;
	
	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']/../../../../..//input[@value='Add To Cart']")
	WebElement YorkshireAddToCart;
	
	@FindBy(xpath="//a[text()='Lobster Thermidor']/../../../../..//input[@value='Add To Cart']")
	WebElement LobsterAddToCart;
	
	@FindBy(xpath="//a[text()='Stuffed Jacket Potatoes']/../../../../..//input[@value='Add To Cart']")
	WebElement StuffedAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	WebElement CheckOutButton;

	public WebElement getYorkshireLambPatties() {
		return YorkshireLambPatties;
	}

	public WebElement getLobsterThermidor() {
		return LobsterThermidor;
	}

	public WebElement getStuffedJacketPatatoes() {
		return StuffedJacketPatatoes;
	}

	public WebElement getYorkshireAddToCart() {
		return YorkshireAddToCart;
	}

	public WebElement getLobsterAddToCart() {
		return LobsterAddToCart;
	}

	public WebElement getStuffedAddToCart() {
		return StuffedAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

}

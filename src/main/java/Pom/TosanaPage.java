package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TosanaPage extends BasePage{

	public TosanaPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[text()='Taco Bell']")
	WebElement Tacobell;
	
	@FindBy(xpath="//a[text()='Taco Bell']/../../../../..//input[@value='Add To Cart']")
	WebElement TacoBellAddToCart;
	
	@FindBy(linkText="Checkout")
	WebElement CheckOutButton;

	public WebElement getTacobell() {
		return Tacobell;
	}

	public WebElement getTacoBellAddToCart() {
		return TacoBellAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}


}

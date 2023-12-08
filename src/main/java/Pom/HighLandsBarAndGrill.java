package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HighLandsBarAndGrill {

	public HighLandsBarAndGrill(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//a[text()='Chicken Madeira']")
	WebElement ChickenMadeira;
	
	@FindBy(xpath="//a[text()='Chicken Madeira']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement ChickenMadeiraAddToCart;
	
	@FindBy(xpath="//a[text()=' Buffalo Wings']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement BuffaloWingsAddToCart;
	
	@FindBy(xpath="//a[text()='Mac N Cheese Bites']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement MacNCheeseBitesAddToCart;
	
	@FindBy(xpath="//a[text()='Signature Potato Twisters']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement SignaturePotatoTwistersAddToCart;
	
	@FindBy(xpath="//a[text()='Meatballs Penne Pasta']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement MeatballsaddToCart;
	
	@FindBy(xpath="//a[text()=' Buffalo Wings']")
	WebElement BuffaloWings;
	
	@FindBy(xpath="//a[text()='Mac N Cheese Bites']")
	WebElement MacNCheeseBites;
	
	@FindBy(xpath="//a[text()='Signature Potato Twisters']")
	WebElement SignaturePotatoTwisters;
	
	@FindBy(xpath="//a[text()='Meatballs Penne Pasta']")
	WebElement Meatballs;
	
	@FindBy(linkText="Checkout")
	WebElement CheckOutButton;

	public WebElement getChickenMadeira() {
		return ChickenMadeira;
	}

	public WebElement getChickenMadeiraAddToCart() {
		return ChickenMadeiraAddToCart;
	}

	public WebElement getBuffaloWingsAddToCart() {
		return BuffaloWingsAddToCart;
	}

	public WebElement getMacNCheeseBitesAddToCart() {
		return MacNCheeseBitesAddToCart;
	}

	public WebElement getSignaturePotatoTwistersAddToCart() {
		return SignaturePotatoTwistersAddToCart;
	}

	public WebElement getMeatballsaddToCart() {
		return MeatballsaddToCart;
	}

	public WebElement getBuffaloWings() {
		return BuffaloWings;
	}

	public WebElement getMacNCheeseBites() {
		return MacNCheeseBites;
	}

	public WebElement getSignaturePotatoTwisters() {
		return SignaturePotatoTwisters;
	}

	public WebElement getMeatballs() {
		return Meatballs;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}


	
	
	
	
	
	
	

}

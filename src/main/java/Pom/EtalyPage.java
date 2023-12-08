package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtalyPage extends BasePage{

	public EtalyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			}
	@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']")
	WebElement PinkSpaghetti;
	
	@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement PinkSpaghettiAddToCart;
	
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement CheesyMashedPotatoAddToCart;
	
	@FindBy(xpath="//a[text()='Crispy Chicken Strips']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement CrispyChickenAddToCart;
	
	@FindBy(xpath="//a[text()='Lemon Grilled Chicken And Pasta']/../../../../..//input[@value=\"Add To Cart\"]")
	WebElement LemonGrilledAddToCart;
	
	@FindBy(xpath="//a[text()='Lemon Grilled Chicken And Pasta']")
	WebElement LemonGrilledChicken;
	
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']")
	WebElement CheesyMashedPotato;
	
	@FindBy(xpath="//a[text()='Crispy Chicken Strips']")
	WebElement CrispyChicken;
	
	@FindBy(linkText="Checkout")
	WebElement CheckOutButton;
	
	@FindBy(name="quantity")
	WebElement quantity;

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getPinkSpaghetti() {
		return PinkSpaghetti;
	}

	public WebElement getPinkSpaghettiAddToCart() {
		return PinkSpaghettiAddToCart;
	}

	public WebElement getCheesyMashedPotatoAddToCart() {
		return CheesyMashedPotatoAddToCart;
	}

	public WebElement getCrispyChickenAddToCart() {
		return CrispyChickenAddToCart;
	}

	public WebElement getLemonGrilledAddToCart() {
		return LemonGrilledAddToCart;
	}

	public WebElement getLemonGrilledChicken() {
		return LemonGrilledChicken;
	}

	public WebElement getCheesyMashedPotato() {
		return CheesyMashedPotato;
	}

	public WebElement getCrispyChicken() {
		return CrispyChicken;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

	public WebElement getQuantity1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}

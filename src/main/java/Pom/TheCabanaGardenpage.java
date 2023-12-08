package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheCabanaGardenpage extends BasePage{

	public TheCabanaGardenpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[text()='Tandoori Chicken']/../../../../..//input[@value='Add To Cart']")
	WebElement TandooriChickenAddToCart;
	
	@FindBy(xpath="//a[text()='Tandoori Chicken']")
	WebElement TandooriChicken;
	
	@FindBy(linkText="Checkout")
	WebElement CheckOutButton;

	public WebElement getTandooriChickenAddToCart() {
		return TandooriChickenAddToCart;
	}

	public WebElement getTandooriChicken() {
		return TandooriChicken;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}



}

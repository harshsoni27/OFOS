package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NanXiangxiaoLongBaoPage extends BasePage{

	public NanXiangxiaoLongBaoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[text()='Vegetable Fried Rice']")
	WebElement VegetableFriedRice;
	
	@FindBy(xpath="//a[text()='Vegetable Fried Rice']/../../../../..//input[@value='Add To Cart']")
	WebElement VegetableFiredRiceAddToCart;
	
	@FindBy(xpath="//a[text()='Prawn Crackers']/../../../../..//input[@value='Add To Cart']")
	WebElement PrawnCrackersAddToCart;
	
	@FindBy(xpath="//a[text()='Spring Rolls']/../../../../..//input[@value='Add To Cart']")
	WebElement SpringRollsAddToCart;
	
	@FindBy(xpath="//a[text()='Manchurian Chicken']/../../../../..//input[@value='Add To Cart']")
	WebElement ManchurianChickenAdToCart;
	
	@FindBy(xpath="//a[text()='Spring Rolls']")
	WebElement SpringRolls;
	
	@FindBy(xpath="//a[text()='Prawn Crackers']")
	WebElement PrawnCrackers;
	
	@FindBy(xpath="//a[text()='Manchurian Chicken']")
	WebElement ManchurianChicken;
	
	@FindBy(linkText="Checkout")
	WebElement CheckOutButton;


	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

	public WebElement getVegetableFriedRice() {
		return VegetableFriedRice;
	}

	public WebElement getVegetableFiredRiceAddToCart() {
		return VegetableFiredRiceAddToCart;
	}

	public WebElement getPrawnCrackersAddToCart() {
		return PrawnCrackersAddToCart;
	}

	public WebElement getSpringRollsAddToCart() {
		return SpringRollsAddToCart;
	}

	public WebElement getManchurianChickenAdToCart() {
		return ManchurianChickenAdToCart;
	}

	public WebElement getSpringRolls() {
		return SpringRolls;
	}

	public WebElement getPrawnCrackers() {
		return PrawnCrackers;
	}

	public WebElement getManchurianChicken() {
		return ManchurianChicken;
	}
	
	
	
	
	
	

}

package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMenu {
	public AddMenu(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="//option[text()='Eataly']")
	WebElement Eataly;
	
	public WebElement getEataly() {
		return Eataly;
	}
	@FindBy(name="d_name")
	WebElement DishName;
	
    @FindBy(name="about")
    WebElement Description;
    
    @FindBy(name="price")
    WebElement price;
    
    @FindBy(name="res_name")
    WebElement Selectrest;
    
    @FindBy(name="submit")
    WebElement save;
    
    @FindBy(xpath="//a[text()='Cancel']")
    WebElement Cancel;

	public WebElement getDishName() {
		return DishName;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getSelectrest() {
		return Selectrest;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return Cancel;
	}
}

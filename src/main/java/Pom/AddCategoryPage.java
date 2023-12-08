package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	public AddCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="c_name")
	WebElement details;
	
	@FindBy(name="submit")
	WebElement save;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement cancel;
	
	@FindBy(xpath="//a[text()='Add Category']")
	WebElement AddCategory;
	
	@FindBy(xpath="//span[text()='Restaurant']")
	WebElement Restaurant;
	
	@FindBy(xpath="(//i[@class='fa fa-edit'])[1]")
	WebElement edit;
	
	@FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]")
	WebElement delete;
	
	
	

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getAddCategory() {
		return AddCategory;
	}

	public WebElement getRestaurant() {
		return Restaurant;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return cancel;
	}

}

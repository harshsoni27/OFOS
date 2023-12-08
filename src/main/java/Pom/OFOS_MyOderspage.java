package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFOS_MyOderspage {

	public OFOS_MyOderspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath=" //button[text()=' Dispatch']")
	WebElement DispatchButton;
	
	@FindBy(xpath="//a[@onclick=\"return confirm('Are you sure you want to cancel your order?');\"]")
	WebElement DeleteButton;

	public WebElement getDispatchButton() {
		return DispatchButton;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

}

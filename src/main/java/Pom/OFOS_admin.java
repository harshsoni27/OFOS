package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFOS_admin {
	public OFOS_admin(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	public
	WebElement username;
	
	@FindBy(name="password")
	public
	WebElement password;
	
	@FindBy(name="submit")
	WebElement loginButton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}

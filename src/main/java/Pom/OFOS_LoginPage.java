package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFOS_LoginPage {

	public OFOS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(linkText="Login")
	WebElement LoginLink;
	
	@FindBy(name="username")
	WebElement UsernameTextfield;
	
	@FindBy(name="password")
	WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement LoginButton;

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getUsernameTextfield() {
		return UsernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}

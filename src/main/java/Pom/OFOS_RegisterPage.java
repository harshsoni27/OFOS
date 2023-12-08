package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OFOS_RegisterPage extends BasePage{

	public OFOS_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText="Register")
	WebElement RegisterLink;
	
	@FindBy(name="username")
	WebElement usernametextField;
	
	@FindBy(name="firstname")
	WebElement FirstnameTextField;
	
	@FindBy(name="lastname")
	WebElement LastnameTextField;
	
	@FindBy(name="email")
	WebElement EmailTextfield;
	
	@FindBy(name="phone")
	WebElement PhoneNumberTextField;
	
	@FindBy(name="password")
	WebElement passwordTextField;
	
	@FindBy(name="cpassword")
	WebElement CpasswordTextField;
	
	@FindBy(name="address")
	WebElement AddressTextField;
	
	@FindBy(name="submit")
	WebElement loginButton;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getUsernametextField() {
		return usernametextField;
	}

	public WebElement getFirstnameTextField() {
		return FirstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getCpasswordTextField() {
		return CpasswordTextField;
	}

	public WebElement getAddressTextField() {
		return AddressTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}


}

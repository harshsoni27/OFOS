package Testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.OFOS_LoginPage;
import Pom.OFOS_RegisterPage;

public class TC_25 extends BasePage{
	@Test
	public void Register() {
		OFOS_RegisterPage r=new OFOS_RegisterPage(driver);
		r.getRegisterLink().click();
		r.getUsernametextField().sendKeys("Bottle1");
		r.getFirstnameTextField().sendKeys("Bottle1");
		r.getLastnameTextField().sendKeys("water1");
		r.getEmailTextfield().sendKeys("Bottle1@gmail.com");
		r.getPasswordTextField().sendKeys("Bottle1@123");
		r.getCpasswordTextField().sendKeys("Bottle1@123");
		r.getPhoneNumberTextField().sendKeys("9980980909");
		r.getAddressTextField().sendKeys("Bangalore");
		r.getLoginButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		OFOS_LoginPage l=new OFOS_LoginPage(driver);
		l.getUsernameTextfield().sendKeys("Bottle1");
		l.getPasswordTextfield().sendKeys("Bottle1@123");
		l.getLoginButton().click();
		
	}

}

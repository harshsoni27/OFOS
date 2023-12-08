package Testscripts;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_18 extends BasePage1{
	@Test
	public void AllMenu() {
		Admin_Home a=new Admin_Home(driver);
		a.getMenu().click();
		a.getAllMenus().click();
	}

}

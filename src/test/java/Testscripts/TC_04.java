package Testscripts;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_04 extends BasePage1{
	@Test
	public void Orders() {
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
	}

}

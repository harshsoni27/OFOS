package Testscripts;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_06 extends BasePage1{
	@Test
	public void ChangeStatus() {
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
		
		a.getEdit().click();
		a.getUpdateStatus().click();
	}

}

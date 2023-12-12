package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_06 extends BasePage1{
	@Test
	public void ChangeStatus() {
		String ExceptedResult="View Order";
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
		
		a.getEdit().click();
		a.getUpdateStatus().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

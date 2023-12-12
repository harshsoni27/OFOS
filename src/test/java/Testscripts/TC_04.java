package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_04 extends BasePage1{
	@Test
	public void Orders() {
		String ExceptedResult="All Orders";
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

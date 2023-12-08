package Testscripts;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class Tc_05 extends BasePage1
{
	@Test
	public void AllRestarant() {
		Admin_Home a=new Admin_Home(driver);
		a.getRestaurant().click();
		a.getAllRestaurant().click();
	}

}

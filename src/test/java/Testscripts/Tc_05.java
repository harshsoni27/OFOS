package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class Tc_05 extends BasePage1
{
	@Test
	public void AllRestarant() {
		String expectedResult="All Restaurants";
		Admin_Home a=new Admin_Home(driver);
		a.getRestaurant().click();
		a.getAllRestaurant().click();
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), expectedResult);
	}

}

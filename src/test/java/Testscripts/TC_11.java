package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.OFOS_welcomepage;

public class TC_11 extends BasePage{
	@Test
	public void DisplayRestaurant() {
		String ExceptedResult="Restaurants";
		OFOS_welcomepage o=new OFOS_welcomepage(driver);
		o.getRestaurantLink().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_31 extends BasePage{
	@Test
	public void RCategory() {
		String ExceptedResult="Dishes";
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrill().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

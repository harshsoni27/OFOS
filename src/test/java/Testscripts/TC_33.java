package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_33 extends BasePage{
	@Test
	public void Quantity() {
		String ExceptedResult="Checkout";
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrill().click();
		HighLandsBarAndGrill h=new HighLandsBarAndGrill(driver);
		h.getMacNCheeseBitesAddToCart().click();
		h.getCheckOutButton().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

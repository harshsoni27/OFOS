package Testscripts;

import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_33 extends BasePage{
	@Test
	public void Quantity() {
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrill().click();
		HighLandsBarAndGrill h=new HighLandsBarAndGrill(driver);
		h.getMacNCheeseBites().click();
		h.getCheckOutButton().click();
	}

}

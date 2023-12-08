package Testscripts;

import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_30 extends BasePage{
	@Test
	public void restaurant() {
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getEatalyViewMenu().click();
	}

}

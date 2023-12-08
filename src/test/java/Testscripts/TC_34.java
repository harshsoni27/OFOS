package Testscripts;

import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.EtalyPage;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_34 extends BasePage{
	@Test
	public void NegativeQuantity() {
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getEataly().click();
		EtalyPage e=new EtalyPage(driver);
		

		e.getCrispyChicken().click();
	}

}

package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.EtalyPage;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_34 extends BasePage{
	@Test
	public void NegativeQuantity() {
		String ExceptedResult="Dishes";
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getEataly().click();
		EtalyPage e=new EtalyPage(driver);
		

		e.getCrispyChicken().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

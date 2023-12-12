package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_MyOderspage;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_32 extends BasePage{
	@Test
	public void AddToCart() {
		String ExceptedResult="Checkout";
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrill().click();
		HighLandsBarAndGrill h=new HighLandsBarAndGrill(driver);
		h.getChickenMadeiraAddToCart().click();
		h.getCheckOutButton().click();
//		OFOS_MyOderspage o=new OFOS_MyOderspage(driver);
//		w.getOrderNowButton().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
		

	}

}

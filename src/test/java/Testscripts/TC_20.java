package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_admin;
import Pom.OFOS_welcomepage;
import Pom.RestraurantPage;

public class TC_20 extends BasePage{
	@Test
	public void Orders() {
		String ExceptedResult="Checkout";
		OFOS_welcomepage o=new OFOS_welcomepage(driver);
		o.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrillViewMenu().click();
		HighLandsBarAndGrill h=new HighLandsBarAndGrill(driver);
		h.getMeatballsaddToCart().click();
		h.getCheckOutButton().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}
	
		@Test
		public void adminOrders() {
			driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/admin/");
			OFOS_admin a=new OFOS_admin(driver);
			
			a.username.sendKeys("admin");
			a.password.sendKeys("codeastro");
			a.getLoginButton().click();
			Admin_Home a1=new Admin_Home(driver);
			a1.getOrders().click();
			
			
		
		
		
		
	}
	
	
}

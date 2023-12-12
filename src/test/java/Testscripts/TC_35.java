package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_welcomepage;
import Pom.OrderNPaypage;
import Pom.RestraurantPage;

public class TC_35 extends BasePage{
	@Test
	public void price() throws InterruptedException {
		String ExceptedResult="My Orders";
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		w.getRestaurantLink().click();
		RestraurantPage r=new RestraurantPage(driver);
		r.getHighlandsBarAndGrill().click();
		
		HighLandsBarAndGrill h=new HighLandsBarAndGrill(driver);
		h.getMacNCheeseBitesAddToCart().click();
		h.getCheckOutButton().click();
		
		OrderNPaypage p=new OrderNPaypage(driver);
		p.getCashOnDelivery().click();
		p.getOrderNowButton().click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
		
	}

}

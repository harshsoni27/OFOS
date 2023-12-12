package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.HighLandsBarAndGrill;
import Pom.OFOS_MyOderspage;
import Pom.OFOS_welcomepage;
import Pom.OrderNPaypage;
import Pom.RestraurantPage;

public class TC_40 extends BasePage{
	@Test
	public void UpdatedOrders() throws InterruptedException {
		String ExceptedResult="";
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
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		OFOS_MyOderspage o=new OFOS_MyOderspage(driver);
		o.getDeleteButton().click();
		
		w.getOrderNowButton().click();
		
	}

}

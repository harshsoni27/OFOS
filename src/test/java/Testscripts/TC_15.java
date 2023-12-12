package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.AddRestarauntpage;
import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_15 extends BasePage1{
	@Test
	public void AddRestraunt() {
		String ExceptedResult="Add Restaurant";
		Admin_Home a=new Admin_Home(driver);
		a.getRestaurant().click();
		a.getAddRestaurant().click();
		AddRestarauntpage r=new AddRestarauntpage(driver);
		r.getRes_name().sendKeys("MBA Chai wala");
		r.getEmail().sendKeys("mba@gmail.com");
		r.getPhone().sendKeys("56789045783");
		r.getWeburl().sendKeys("chaiwala@yahoo.in");
		r.getOpenHr().click();
		r.getCloseHr().click();
		r.getDay().click();
		r.getAddress().sendKeys("Bengaluru");
		r.getSave().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

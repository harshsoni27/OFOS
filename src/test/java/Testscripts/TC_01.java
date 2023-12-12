package Testscripts;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pom.AddRestarauntpage;
import Pom.Admin_Home;
import Pom.BasePage1;
import dev.failsafe.internal.util.Assert;

public class TC_01 extends BasePage1{
	@Test
	public void AllRestraurant() {
		String title="Add Restaurant";
		Admin_Home a=new Admin_Home(driver);
		System.out.println(driver.getTitle());
		a.getRestaurant().click();
		a.getAddRestaurant().click();
		AddRestarauntpage a1=new AddRestarauntpage(driver);
		a1.getRes_name().sendKeys("OliveGarden");
		a1.getEmail().sendKeys("res@gmail.com");
		a1.getPhone().sendKeys("9988776655");
		a1.getAddress().sendKeys("Bangalore");
		a1.getSave().click();
		System.out.println(driver.getTitle());
	    AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
	}

}

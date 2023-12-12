package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_17 extends BasePage1{
	@Test
	public void Delete() {
		String ExceptedResult="All Restaurants";
		Admin_Home a=new Admin_Home(driver);
		a.getRestaurant().click();
		a.getAllRestaurant().click();
		AddCategoryPage c=new AddCategoryPage(driver);
		c.getDelete().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

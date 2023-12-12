package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_16 extends BasePage1{
	@Test
	public void EditRes() {
		String ExceptedResult="Update Restaurant";
		Admin_Home a=new Admin_Home(driver);
		a.getRestaurant().click();
		a.getAllRestaurant().click();
		AddCategoryPage c=new AddCategoryPage(driver);
		c.getEdit().click();
		c.getSave().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

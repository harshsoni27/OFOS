package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.BasePage1;

public class TC_21 extends BasePage1{
	@Test
	public void update() {
		String ExceptedResult="Update Category";
		AddCategoryPage a=new AddCategoryPage(driver);
		a.getRestaurant().click();
		a.getAddCategory().click();
		a.getEdit().click();
		a.getSave().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

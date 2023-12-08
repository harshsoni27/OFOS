package Testscripts;

import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.BasePage1;

public class TC_12 extends BasePage1{
	@Test
	public void newcategory() {
		AddCategoryPage a=new AddCategoryPage(driver);
		a.getRestaurant().click();
		a.getAddCategory().click();
		a.getDetails().sendKeys("Karnataka Style");
		a.getSave().click();
	}

}

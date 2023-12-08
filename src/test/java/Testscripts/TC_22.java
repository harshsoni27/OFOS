package Testscripts;

import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.BasePage1;

public class TC_22 extends BasePage1{
	@Test
	public void delete() {
		AddCategoryPage a=new AddCategoryPage(driver);
		a.getRestaurant().click();
		a.getAddCategory().click();
		a.getDelete().click();
	}

}

package Testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pom.AddCategoryPage;
import Pom.BasePage1;

public class TC_14 extends BasePage1{
@Test
public void delete() {
	AddCategoryPage a=new AddCategoryPage(driver);
	a.getRestaurant().click();
	a.getAddCategory().click();
	a.getDelete().click();
	
	assertEquals(driver.getTitle(), "Add Category", "Add Category page displayed");
}
}

package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.AddMenu;
import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_19 extends BasePage1{
	@Test
	public void AddNewDish() {
		String ExceptedResult="";
		Admin_Home a=new Admin_Home(driver);
		a.getMenu().click();
		a.getAddMenu().click();
		AddMenu m=new AddMenu(driver);
		m.getDishName().sendKeys("Poori Sagu");
		m.getDescription().sendKeys("south Indian dish");
		m.getPrice().sendKeys("20");
		m.getSelectrest().click();
		m.getEataly().click();
		m.getSave().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}

}

package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pom.AddMenu;
import Pom.AddRestarauntpage;
import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_02 extends BasePage1{
	@Test
	public void Menu() {
//		String ExpectedResult="";
		Admin_Home a=new Admin_Home(driver);
		a.getMenu().click();
		a.getAddMenu().click();
		AddMenu m=new AddMenu(driver);
		m.getDishName().sendKeys("Noodels");
		m.getPrice().sendKeys("200");
		m.getSelectrest().click();
		AddRestarauntpage a1=new AddRestarauntpage(driver);
	   
		m.getDescription().sendKeys("Outsanding");
		m.getSave().click();
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "Add Menu");
			
	}

}

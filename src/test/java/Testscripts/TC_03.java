package Testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_03 extends BasePage1{
	@Test
	public void Users() {
		Admin_Home a=new Admin_Home(driver);
		a.getUsers().click();
		
	    assertEquals(driver.getTitle(), "User", "User page is displayed");

	}

}

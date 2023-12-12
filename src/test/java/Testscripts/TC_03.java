package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_03 extends BasePage1{
	@Test
	public void Users() {
		String ExpectedResult="All Users";
		Admin_Home a=new Admin_Home(driver);
		a.getUsers().click();
		
	    AssertJUnit.assertEquals(driver.getTitle(), ExpectedResult);

	}

}

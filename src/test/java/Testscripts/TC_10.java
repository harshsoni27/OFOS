package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage;
import Pom.BasePage1;
import Pom.LogOutpage;
import Pom.OFOS_admin;

public class TC_10 extends BasePage1{
//	@Test
//	public void Dualrole() {
//		LogOutpage l=new LogOutpage(driver);
//		l.getLogoutlink().click();
//		
//		
//		
//	}
	@Test
	public void adminModule() {
		String ExceptedResult="Admin Panel";
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/admin/");
		OFOS_admin a=new OFOS_admin(driver);
		a.username.sendKeys("admin");
		a.password.sendKeys("codeastro");
		
		
		a.getLoginButton().click();
		Admin_Home a1=new Admin_Home(driver);
		a1.getDashBoard().click();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
		
		
		
	}

}

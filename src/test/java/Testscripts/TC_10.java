package Testscripts;

import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage;
import Pom.LogOutpage;
import Pom.OFOS_admin;

public class TC_10 extends BasePage{
	@Test
	public void Dualrole() {
		LogOutpage l=new LogOutpage(driver);
		l.getLogoutlink().click();
		
		
		
	}
	@Test
	public void adminModule() {
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/admin/");
		OFOS_admin a=new OFOS_admin(driver);
		a.username.sendKeys("admin");
		a.password.sendKeys("codeastro");
		
		
		a.getLoginButton().click();
		Admin_Home a1=new Admin_Home(driver);
		a1.getDashBoard().click();
		
		
	}

}

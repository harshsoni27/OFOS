package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_24 extends BasePage1{
	@Test
	public void orderStatus() {
		String ExceptedResult="View Order";
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
		
		a.getEdit().click();
//		a.getUpdateStatus().click();
//		a.getStatusDropDown().click();
//		a.getCancelled().click();
//		a.getMsg().sendKeys("cancelled");
//		a.getSubmitButton().click();
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
	}
	}



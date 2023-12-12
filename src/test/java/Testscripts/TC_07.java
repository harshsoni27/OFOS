package Testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pom.Admin_Home;
import Pom.BasePage1;

public class TC_07 extends BasePage1{
	@Test
	public void Delivered() {
		String ExceptedResult="View Order";
		Admin_Home a=new Admin_Home(driver);
		a.getOrders().click();
		a.getEdit().click();
		a.getUpdateStatus().click();
//		a.getStatusDropDown().click();
//		a.getDelivered().click();
//		a.getMsg().sendKeys("delivered");
//		a.getSubmitButton().click();
//		
//		
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		AssertJUnit.assertEquals(driver.getTitle(), ExceptedResult);
		
	}

}

package Testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pom.BasePage;
import Pom.OFOS_welcomepage;

public class TC_029 extends BasePage{
	@Test
	public void OrderNow() {
		OFOS_welcomepage w=new OFOS_welcomepage(driver);
		
		w.getHomeLink().click();
		for(;;) {
			try {
			w.getOrderNowButton().click();
			break;
		}catch(Exception e) {
			
		}
		
}

	}
}

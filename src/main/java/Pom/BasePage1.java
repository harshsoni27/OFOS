package Pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic_class.ExcelSheet;

public class BasePage1 {
	public WebDriver driver;
	@BeforeClass
	public void Browserlaunch() {
		driver=new ChromeDriver();
		Reporter.log("browser launched successfully");
		driver.manage().window().maximize();
		Reporter.log("browser window is maximised");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	@BeforeMethod
	public void logintoApp() throws EncryptedDocumentException, IOException {
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/admin/");
		OFOS_admin a=new OFOS_admin(driver);
		ExcelSheet e=new ExcelSheet();
		a.username.sendKeys("admin");
		a.password.sendKeys("codeastro");
//	    a.username.sendKeys(e.readData("admin", 1, 0).toString());
//	    a.password.sendKeys(e.readData("admin", 1, 1).toString());
		a.loginButton.click();
		

	}
	@AfterMethod
	public void downtear() {
		driver.quit();
	}
}

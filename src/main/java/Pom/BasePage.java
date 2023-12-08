package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
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
	public void logintoApp() {
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/login.php");
		OFOS_LoginPage l=new OFOS_LoginPage(driver);
		l.getUsernameTextfield().sendKeys("Bottle1");
		l.getPasswordTextfield().sendKeys("Bottle1@123");
		l.getLoginButton().click();
		
		
	}

}

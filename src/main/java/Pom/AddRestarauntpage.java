package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRestarauntpage {
	public AddRestarauntpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="res_name")
	WebElement res_name;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="url")
	WebElement weburl;
	
	@FindBy(xpath="//select[@name='o_hr']")
	WebElement OpenHr;
	
	@FindBy(xpath="//select[@name='c_hr']")
	WebElement closeHr;
	
	@FindBy(xpath="//select[@name='o_days']")
	WebElement OpenDays;
	
	@FindBy(xpath="c_name")
	WebElement CategoryName;
	
	@FindBy(xpath="//textarea[@name=\"address\"]")
	WebElement address;
	
	@FindBy(name="submit")
	WebElement save;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//option[text()='7am']")
	WebElement StartTime7;
	
	@FindBy(xpath="//option[text()='3am']")
	WebElement EndTime3;
	
	@FindBy(xpath="//option[text()='Mon-Tue']")
	WebElement day;
	
	@FindBy(xpath="//option[text()='South Indian']")
	WebElement dish;

	public WebElement getStartTime7() {
		return StartTime7;
	}

	public WebElement getEndTime3() {
		return EndTime3;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getDish() {
		return dish;
	}

	public WebElement getRes_name() {
		return res_name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getWeburl() {
		return weburl;
	}

	public WebElement getOpenHr() {
		return OpenHr;
	}

	public WebElement getCloseHr() {
		return closeHr;
	}

	public WebElement getOpenDays() {
		return OpenDays;
	}

	public WebElement getCategoryName() {
		return CategoryName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return Cancel;
	}

}

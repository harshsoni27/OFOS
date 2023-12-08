package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_orderspage1 {
	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getUpdateStatus() {
		return UpdateStatus;
	}

	public Admin_orderspage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath="(//i[@class='fa fa-edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="//button[text()='Update Order Status']")
	WebElement UpdateStatus;
	
	@FindBy(xpath="//select[@name='status']")
	WebElement StatusDropDown;
	
	@FindBy(xpath="//option[text()='On the way']")
	WebElement OnTheWay;
	
	@FindBy(xpath="//option[text()='Delivered']")
	WebElement Delivered;
	
	@FindBy(xpath="//option[text()='Cancelled']")
	WebElement Cancelled;
	
	@FindBy(xpath="//input[@name='update']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//textarea[@name='remark']")
	WebElement Msg;

	public WebElement getMsg() {
		return Msg;
	}

	public WebElement getStatusDropDown() {
		return StatusDropDown;
	}

	public WebElement getOnTheWay() {
		return OnTheWay;
	}

	public WebElement getDelivered() {
		return Delivered;
	}

	public WebElement getCancelled() {
		return Cancelled;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	


}

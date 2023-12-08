package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Home {
	public Admin_Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement DashBoard;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement Users;
	
	@FindBy(xpath="//span[text()='Restaurant']")
	WebElement Restaurant;
	
	@FindBy(xpath="//span[text()='Menu']")
	WebElement Menu;
	
	@FindBy(xpath="//span[text()='Orders']")
	WebElement Orders;
	
	@FindBy(xpath="//a[text()='All Restaurant']")
	WebElement AllRestaurant;
	
	@FindBy(xpath="//a[text()='Add Category']")
	WebElement AddCategory;
	
	public WebElement getDashBoard() {
		return DashBoard;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getRestaurant() {
		return Restaurant;
	}

	public WebElement getMenu() {
		return Menu;
	}

	public WebElement getOrders() {
		return Orders;
	}

	public WebElement getAllRestaurant() {
		return AllRestaurant;
	}

	public WebElement getAddCategory() {
		return AddCategory;
	}

	public WebElement getAddRestaurant() {
		return AddRestaurant;
	}

	public WebElement getAllMenus() {
		return AllMenus;
	}

	public WebElement getAddMenu() {
		return AddMenu;
	}
	@FindBy(xpath="//a[text()='Add Restaurant']")
	WebElement AddRestaurant;
	
	@FindBy(xpath="//a[text()='All Menues']")
	WebElement AllMenus;
	
	@FindBy(xpath="//a[text()='Add Menu']")
	WebElement AddMenu;
	
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

	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getUpdateStatus() {
		return UpdateStatus;
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

	public WebElement getMsg() {
		return Msg;
	}

	


}

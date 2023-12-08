package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestraurantPage extends BasePage {

	public RestraurantPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText="Restaurants ")
	WebElement RestaurantLink;
	
	@FindBy(linkText="North Street Tavern")
	WebElement NorthStreetTavern;
	
	@FindBy(linkText="Eataly")
	WebElement Eataly;
	
	@FindBy(linkText="Nan Xiang Xiao Long Bao")
	WebElement NanXiangXiaoLongBao;
	
	@FindBy(linkText="Highlands Bar & Grill")
	WebElement HighlandsBarAndGrill;
	
	@FindBy(linkText="The Cabana Garden")
	WebElement TheCabanaGarden;
	
	@FindBy(linkText="Toscana")
	WebElement Toscana;

	public WebElement getRestaurantLink() {
		return RestaurantLink;
	}

	public WebElement getNorthStreetTavern() {
		return NorthStreetTavern;
	}

	public WebElement getEataly() {
		return Eataly;
	}

	public WebElement getNanXiangXiaoLongBao() {
		return NanXiangXiaoLongBao;
	}

	public WebElement getHighlandsBarAndGrill() {
		return HighlandsBarAndGrill;
	}

	public WebElement getTheCabanaGarden() {
		return TheCabanaGarden;
	}

	public WebElement getToscana() {
		return Toscana;
	}
	
	@FindBy(xpath="(//a[text()='View Menu'])[1]")
	WebElement NorthStreetTavernViewMenu;
	
	@FindBy(xpath="(//a[text()='View Menu'])[2]")
	WebElement EatalyViewMenu;
	
	@FindBy(xpath="(//a[text()='View Menu'])[3]")
	WebElement NanXiangXiaoLongBaoViewMenu;
	
	@FindBy(xpath="(//a[text()='View Menu'])[4]")
	WebElement HighlandsBarAndGrillViewMenu;
	
	@FindBy(xpath="(//a[text()='View Menu'])[5]")
	WebElement TheCabanaGardenViewMenu;
	
	@FindBy(xpath="(//a[text()='View Menu'])[6]")
	WebElement ToscanaViewMenu;

	public WebElement getToscanaViewMenu() {
		return ToscanaViewMenu;
	}

	public void setToscanaViewMenu(WebElement toscanaViewMenu) {
		ToscanaViewMenu = toscanaViewMenu;
	}

	public WebElement getNorthStreetTavernViewMenu() {
		return NorthStreetTavernViewMenu;
	}

	public WebElement getEatalyViewMenu() {
		return EatalyViewMenu;
	}

	public WebElement getNanXiangXiaoLongBaoViewMenu() {
		return NanXiangXiaoLongBaoViewMenu;
	}

	public WebElement getHighlandsBarAndGrillViewMenu() {
		return HighlandsBarAndGrillViewMenu;
	}

	public WebElement getTheCabanaGardenViewMenu() {
		return TheCabanaGardenViewMenu;
	}
	
	
	
	
	
	
	

}

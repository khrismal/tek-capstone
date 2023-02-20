package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage  extends BaseSetup{

	public RetailHomePage() {
		
        PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(css ="#accountLink")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
//	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
//	public WebElement kasaOutdoorSmartPlug;
	@FindBy(xpath = "//div[@class='products__layout']")
	public WebElement itemToBuy;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement qtyDropDwn;
	
	@FindBy(css = "#addToCartBtn")
	public WebElement addToCartBtn;
	
	@FindBy(id = "cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckout;
	
	@FindBy(xpath = "//button[@class='checkout__address-btn']")
	public WebElement addNewAddressLink;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addCreditOrDebitCard;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeYourOrderBtn;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanksMessage;
	
	@FindBy(id = "orderLink")
	public WebElement ordersOption; 
	
	
}

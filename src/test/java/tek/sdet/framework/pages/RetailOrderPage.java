package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelTheOrderBtnInYourOrders;
	
	@FindBy(css ="#returnBtn")
	public WebElement returnItemsBtn;
	
	@FindBy(id = "buyAgainBtn")
	public WebElement buyAgainBtn;
	
	@FindBy(xpath = "//*[@class='order__cancel-input']")
	public WebElement selectCancelationReason;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement finalCancelOrderBtn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelledMessage;
	
	@FindBy(xpath = "//div[@class='order__content-actions']")
	public WebElement firstOrderInTheList;
	//(//div[@class = 'order'])[1]
	
	@FindBy(id = "reasonInput")
	public WebElement selectReturnReason;
	
	@FindBy(css = "#dropOffInput")
	public WebElement selectWhereToDropOff;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;
	
	@FindBy(css = "#reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement addHeadlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement commentInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewWasAddedSuccessMessage;
	
	
}

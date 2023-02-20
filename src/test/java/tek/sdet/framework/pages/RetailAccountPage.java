package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath = "//*[contains(text(),'Cart ')]")
	public WebElement cartBtn;
	
	@FindBy(css = "#logoutBtn")
	public WebElement logOutBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Orders')]")
	public WebElement orderBtn;
	
	@FindBy(css = "#profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(xpath = "//*[@name='phoneNumber']")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy(css = "#previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(xpath = "//*[@name='newPassword']")
	public WebElement newPasswordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(xpath = "//*[text()='Update']")
	public WebElement updateBtn;
	
	@FindBy(xpath = "//*[text()='Change Password']")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement addAPaymentMethodLink;
	
	@FindBy(css = "#cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(css = "#nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(css = "#expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy (id = "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(xpath = "//*[@name = 'securityCode']")
	public WebElement securityCodeInput;
	
	@FindBy(xpath = "//*[@class ='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatingSuccessMessage;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedMessage; 
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentmethodUpdateSuccessMessage;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardBtn;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editBtn;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeBtn;
	
	@FindBy(css = "#cardNumberInput")
	public WebElement updateCardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement updateNameOnCardInput;
	
	@FindBy(css = "#expirationMonthInput")
	public WebElement updateExpirationMonth;
	
	@FindBy(xpath = "//*[@name = 'expirationYear']")
	public WebElement updateExpirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement updateSecurityCode;
	
	@FindBy(css = "#paymentSubmitBtn")
	public WebElement updateYourCardBtn;

	@FindBy(xpath = "//div[@class='account__payment-selected account__payment-item']")
	public WebElement existingCardForTest;
	
	@FindBy(id = "countryDropdown")
	public WebElement addNewAddressCountryInput;

	@FindBy(css = "#fullNameInput")
	public WebElement addNewAddressFullNameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement addNewAddressPhoneNumberInput;
	
	@FindBy(css = "#streetInput")
	public WebElement addNewAddressStreetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement addNewAddressApartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement addNewAddressCityInput;
	
	@FindBy(xpath = "//select[@class= 'account__address-new-dropdown' and @name='state']")
	public WebElement addNewAddressStateInput;
	
	@FindBy(id = "zipCodeInput")
	public WebElement addNewAddresZipCode;
	
	@FindBy(xpath = "//button[text()='Add Your Address']")
	public WebElement addNewAddressAddYourAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessMessage;
	
	@FindBy(xpath = "//button[@class = 'account__address-btn' and text() = 'Edit']")
	public WebElement editBtnInAddAddress;
	
	@FindBy(xpath = "//button[@class = 'account__address-btn' and text() = 'Remove']")
	public WebElement removeBtnInAddAddress;
	
	@FindBy(css = "#addressBtn")
	public WebElement UpdateYourAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateSuccessMessage;

	@FindBy(xpath = "//div[@class='account__address-single']")
	public WebElement existingAddedAddressForTest;

}

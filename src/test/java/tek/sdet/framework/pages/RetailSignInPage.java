package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy(id = "email")
	public WebElement emailInput;
	
	@FindBy(xpath = "//*[@type='password']")
	public WebElement passwordInput;
	
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement LoginBtn;
	
	@FindBy(linkText = "Create New Account")
	public WebElement createNewAccountBtn;
	
	@FindBy(xpath = "//*[text()='want to sell something?']")
	public WebElement wantToSellSomethingLink;
	// SignUp UI elements
	@FindBy(css = "#nameInput")
	public WebElement signUpNameInput;
	
	@FindBy(xpath = "//*[@name='email']")
	public WebElement signUpEmailInput;
	
	@FindBy(id = "passwordInput")
	public WebElement signUpPasswordInput;
	
	@FindBy(css = "#confirmPasswordInput")
	public WebElement signUpConfirmPassword;
	
	@FindBy(xpath = "(//*[contains(text(),'Sign Up')])[2]")
	public WebElement signUpBtn;
}

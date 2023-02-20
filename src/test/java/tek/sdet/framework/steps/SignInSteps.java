package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}
	
	@When("User click on Sign in option")
	public void userClickOnSignIn() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on Sign in option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.signInPage().emailInput, emailValue);
		sendText(factory.signInPage().passwordInput, passwordValue);
		logger.info("User entered email "+ emailValue +" and password " + passwordValue);
	}
	
	@And("User click on login button")
	public void userClickOnLoginBtn() {
		click(factory.signInPage().LoginBtn);
		logger.info("User clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User should be logged in into Account");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateAccountBtn() {
		click(factory.signInPage().createNewAccountBtn);
		logger.info("User clickeded on Create New Account button");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameInput,signUpInformation.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailInput,signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordInput,signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassword,signUpInformation.get(0).get("confirmPassword"));
//		sendText(factory.signInPage().signUpNameInput, name);
//		sendText(factory.signInPage().signUpEmailInput, email);
//		sendText(factory.signInPage().signUpPasswordInput, password);
//		sendText(factory.signInPage().signUpConfirmPassword, confirmPass);
		logger.info("user filled the signUp information form");
	}
	
	@And("User click on SignUp button")
	public void userClickSignUpBtn() {
		click(factory.signInPage().signUpBtn);
		logger.info("User clicked on SignUp button");
	}
	
	@Then("User should be logged into account page")
	public void userLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User should be logged into account page");
	}
}

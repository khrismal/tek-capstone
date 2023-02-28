package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdatePersonalInfo(String nameValue, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, phoneNumber);
		logger.info("User updated Name " + nameValue + " and Phone " + phoneNumber);
	}

	@And("User click on Update button")
	public void userClickOnUpdateBtn() {
		click(factory.accountPage().updateBtn);
		logger.info("User clicked on Update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInfoShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("User profile information should be updated");
	}

	@And("User enter below information")
	public void userUpdatePasswordInfo(DataTable dataTable) {
		List<Map<String, String>> updatePasswordInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, updatePasswordInformation.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, updatePasswordInformation.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, updatePasswordInformation.get(0).get("confirmPassword"));
		logger.info("User updated password information");
	}

	@And("User click on Change Password button")
	public void userClickOnChangePasswordBtn() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("User clicked on Change Password button");
	}

	@Then("A message should be displayed ‘Password Updated Successfully’")
	public void passwordUpdatingMessageshouldBeDisplayed() {
		waitTillPresence(factory.accountPage().passwordUpdatingSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatingSuccessMessage));
		logger.info("A message 'Password Updated Successfully' should be displayed ");

	}

	// add payment method
	@And("User click on Add a payment method link")
	public void userClickOnAddPaymentMethodLink() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.accountPage().addAPaymentMethodLink);
		logger.info("User clicked on Add a payment method link");
	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInfo(DataTable dataTable) {
		List<Map<String, String>> debitOrCreditCardInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, DataGeneratorUtility.data(debitOrCreditCardInfo.get(0).get("cardNumber")));
		sendText(factory.accountPage().nameOnCardInput, DataGeneratorUtility.data(debitOrCreditCardInfo.get(0).get("nameOnCard")));
		selectByValue(factory.accountPage().expirationMonthInput, debitOrCreditCardInfo.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput, debitOrCreditCardInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, DataGeneratorUtility.data(debitOrCreditCardInfo.get(0).get("securityCode")));

		
		
//		sendText(factory.accountPage().cardNumberInput, debitOrCreditCardInfo.get(0).get("cardNumber"));
//		sendText(factory.accountPage().nameOnCardInput, debitOrCreditCardInfo.get(0).get("nameOnCard"));
//		selectByValue(factory.accountPage().expirationMonthInput, debitOrCreditCardInfo.get(0).get("expirationMonth"));
//		selectByValue(factory.accountPage().expirationYearInput, debitOrCreditCardInfo.get(0).get("expirationYear"));
//		sendText(factory.accountPage().securityCodeInput, debitOrCreditCardInfo.get(0).get("securityCode"));
		logger.info("User filled Debit or credit card information");
	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCardBtn() {
		click(factory.accountPage().addYourCardBtn);
		logger.info("User clicked on Add your card button");
	}

	@Then("A message should be displayed ‘Payment Method added successfully’")
	public void paymentMethodAddedSuccessMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().paymentMethodAddedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedMessage));
		logger.info("A message should be displayed ‘Payment Method added successfully’");
	}

	// edit payment method
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editBtn);
		logger.info("User clicked on Edit option of card section");
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> updateDebitOrCreditCardInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().updateCardNumberInput);
		clearTextUsingSendKeys(factory.accountPage().updateNameOnCardInput);
		clearTextUsingSendKeys(factory.accountPage().updateSecurityCode);
		sendText(factory.accountPage().cardNumberInput, DataGeneratorUtility.data(updateDebitOrCreditCardInfo.get(0).get("cardNumber")));
		sendText(factory.accountPage().nameOnCardInput, DataGeneratorUtility.data(updateDebitOrCreditCardInfo.get(0).get("nameOnCard")));
		selectByValue(factory.accountPage().updateExpirationYear,
				updateDebitOrCreditCardInfo.get(0).get("expirationYear"));
		selectByValue(factory.accountPage().updateExpirationMonth,
				updateDebitOrCreditCardInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCodeInput, DataGeneratorUtility.data(updateDebitOrCreditCardInfo.get(0).get("securityCode")));
		logger.info("User edited information with below data");
				
		
//		sendText(factory.accountPage().updateCardNumberInput, updateDebitOrCreditCardInfo.get(0).get("cardNumber"));
//		sendText(factory.accountPage().updateNameOnCardInput, updateDebitOrCreditCardInfo.get(0).get("nameOnCard"));
//		selectByValue(factory.accountPage().updateExpirationMonth,
//				updateDebitOrCreditCardInfo.get(0).get("expirationMonth"));
//		selectByValue(factory.accountPage().updateExpirationYear,
//				updateDebitOrCreditCardInfo.get(0).get("expirationYear"));
//		sendText(factory.accountPage().updateSecurityCode, updateDebitOrCreditCardInfo.get(0).get("securityCode"));
	

	}

	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardBtn);
		logger.info("User clicked on Update Your Card button");
	}

	@Then("A message should be displayed ‘Payment Method updated Successfully")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentmethodUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentmethodUpdateSuccessMessage));
		logger.info("A message should be displayed ‘Payment Method updated Successfully");
	}

//remove Debit or Credit card

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removeBtn);
		logger.info("User clicked on remove option of card section");
	}

	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved()   {
		//refresh();
		//Thread.sleep(5000);
		//Assert.assertFalse(isElementDisplayed(factory.accountPage().existingCardForTest));
		//it pass if element is not on the page
		//Assert.assertEquals(0, getDriver().findElement(By.xpath("//div[@class='account__payment-selected account__payment-item']")).getSize());
		Assert.assertTrue(getDriver().findElements(By.xpath("//div[@class='account__payment-selected account__payment-item']")).isEmpty());
		logger.info("Payment details should be removed");
	}
//user add address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("User clicked on Add address option");
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		clearTextUsingSendKeys(factory.accountPage().addNewAddressFullNameInput);
		clearTextUsingSendKeys(factory.accountPage().addNewAddressPhoneNumberInput);
		clearTextUsingSendKeys(factory.accountPage().addNewAddressStreetInput);
		clearTextUsingSendKeys(factory.accountPage().addNewAddressApartmentInput);
		clearTextUsingSendKeys(factory.accountPage().addNewAddressCityInput);
		clearTextUsingSendKeys(factory.accountPage().addNewAddresZipCode);
		selectByVisibleText(factory.accountPage().addNewAddressCountryInput, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().addNewAddressFullNameInput, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().addNewAddressPhoneNumberInput, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().addNewAddressStreetInput, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().addNewAddressApartmentInput, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().addNewAddressCityInput, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().addNewAddressStateInput, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().addNewAddresZipCode, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("User filled new address form");

		
//		List<Map<String, String>> fillNewAddressForm = dataTable.asMaps(String.class, String.class);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddressFullNameInput);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddressPhoneNumberInput);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddressStreetInput);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddressApartmentInput);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddressCityInput);
//		clearTextUsingSendKeys(factory.accountPage().addNewAddresZipCode);
//		selectByValue(factory.accountPage().addNewAddressCountryInput, fillNewAddressForm.get(0).get("country"));
//		sendText(factory.accountPage().addNewAddressFullNameInput, fillNewAddressForm.get(0).get("fullName"));
//		sendText(factory.accountPage().addNewAddressPhoneNumberInput, fillNewAddressForm.get(0).get("phoneNumber"));
//		sendText(factory.accountPage().addNewAddressStreetInput, fillNewAddressForm.get(0).get("streetAddress"));
//		sendText(factory.accountPage().addNewAddressApartmentInput, fillNewAddressForm.get(0).get("apt"));
//		sendText(factory.accountPage().addNewAddressCityInput, fillNewAddressForm.get(0).get("city"));
//		selectByValue(factory.accountPage().addNewAddressStateInput, fillNewAddressForm.get(0).get("state"));
//		sendText(factory.accountPage().addNewAddresZipCode, fillNewAddressForm.get(0).get("zipCode"));
	

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addNewAddressAddYourAddressBtn);
		logger.info("User clicked Add Your Address button");
	}

	@Then("A message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().addressAddedSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessMessage));
		logger.info("A message should be displayed ‘Address Added Successfully’");
	}

//edit address
	@Then("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().editBtnInAddAddress);
	    logger.info("User clicked on edit address option");
	}
	
	@Then("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	    click(factory.accountPage().UpdateYourAddressBtn);
	    logger.info("User clicked update Your Address button");
	}
	@Then("A message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().addressUpdateSuccessMessage);
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdateSuccessMessage));
	   logger.info("A message should be displayed ‘Address Updated Successfully’");
	}

//remove address

	@Then("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		waitTillPresence(factory.accountPage().existingAddedAddressForTest);
		click(factory.accountPage().removeBtnInAddAddress);
		logger.info("User clicked on remove option of Address section");
	}
	

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	    refresh();
		//Assert.assertFalse(isElementDisplayed(factory.accountPage().existingAddedAddressForTest));
		//Assert.assertTrue(getDriver().findElements(By.xpath("//div[@class='account__payment-selected account__payment-item']")).isEmpty());

	    Assert.assertTrue(getDriver().findElements(By.xpath("//div[@class='account__address-single']")).isEmpty());
		logger.info("Address details should be removed");
	}




}

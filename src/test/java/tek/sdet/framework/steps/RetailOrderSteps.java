package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Orders section")
	public void userClickOnOrdersSection() throws InterruptedException  {
		Thread.sleep(5000);
		//waitTillClickable(factory.homePage().ordersOption);
		//waitTillPresence(factory.homePage().ordersOption);
		click(factory.homePage().ordersOption);
		getElementText(factory.orderPage().yourOrdersText);
		logger.info("User clicked on Orders section");
	}

//	//there is no need for this step
//	@When("User click on first order in list")
//	public void userClickOnFirstOrderInList() {
//		waitTillPresence(factory.orderPage().cancelTheOrderBtnInYourOrders);
//		click(factory.orderPage().firstOrderHideDetails);
//		waitTillPresence(factory.orderPage().firstOrderShowDetails);
//		waitTillClickable(factory.orderPage().firstOrderShowDetails);
//		click(factory.orderPage().firstOrderShowDetails);
//		logger.info("User clicked on first order in list");
//
//	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderBtn() throws InterruptedException {
		Thread.sleep(5000);
		waitTillPresence(factory.orderPage().cancelTheOrderBtnInYourOrders);
		click(factory.orderPage().cancelTheOrderBtnInYourOrders);
		logger.info("User clicked on Cancel The Order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String cancelationReason) {
		selectByVisibleText(factory.orderPage().selectCancelationReason, cancelationReason);
		logger.info("User selected the cancelation Reason " + cancelationReason);

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().finalCancelOrderBtn);
		logger.info("User clicked on Cancel Order button");
	}

	@Then("A cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelledMessage));
		logger.info("A cancelation message should be displayed ‘Your Order Has Been Cancelled’");
	}

	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.orderPage().returnItemsBtn);
		logger.info("User clicked on Return Items button");
	}

	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returningReason) {
		selectByVisibleText(factory.orderPage().selectReturnReason, returningReason);
		logger.info("User selected the Return Reason " + returningReason);
	}

	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String droppOffLocation) {
		selectByVisibleText(factory.orderPage().selectWhereToDropOff, droppOffLocation);
		logger.info("User selected the drop off service " + droppOffLocation);

	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnBtn);
		logger.info("User clicked on Return Order button");
	}

	@Then("A cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnWasSuccessfullMessage));
		logger.info("A cancelation message should be displayed ‘Return was successful’");
	}

	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User clicked on Review button");
	}

	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String comment) {
		sendText(factory.orderPage().addHeadlineInput, headline);
		sendText(factory.orderPage().commentInput, comment);
		logger.info("User wrote Review headline" + headline + "and text " + comment);

	}

	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewBtn);
		logger.info("User clicked Add your Review button");
	}

	@Then("A review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.orderPage().reviewWasAddedSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewWasAddedSuccessMessage));
		logger.info("A review message should be displayed ‘Your review was added successfully’");

	}

}

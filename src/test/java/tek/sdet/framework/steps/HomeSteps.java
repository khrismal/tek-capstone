package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("User clicked on All section");
	}

	@Then("Below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal " + expectedSideBar.get(0).get(i));
		}
//		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
//		logger.info("actual is equal to expected");
	}

	@When("User on {string}")
	public void userOnDepartment(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}
	}

	@Then("Below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarElements;
		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + "is present");
				}
			}
		}
	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		List<WebElement> allDepartmentOptions = factory.homePage().sideBarElements;
		for (WebElement department : allDepartmentOptions) {
			if (department.getText().equals(category)) {
				click(department);
			}
		}
		logger.info("User changed the category to " + category);
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String product) {
		sendText(factory.homePage().searchBar, product);
		logger.info("User searched for an item " + product);
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("User clicked on Search icon");
	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().itemToBuy);
		logger.info("User clicked on item");
	}

	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer numberOfProducts) throws InterruptedException {
		Thread.sleep(6000);
		selectByIndex(factory.homePage().qtyDropDwn, numberOfProducts);
		logger.info("User selected quantity " + numberOfProducts);
	}

	@When("User click add to Cart button")
	public void userclickAddToCartButton() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.homePage().addToCartBtn);
		logger.info("User clicked add to Cart button");
	}
	//how to check that Cartqty = 2?
	//rewrite this method
	@Then("The cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer cartQTY) throws InterruptedException {
		Thread.sleep(5000);
		//string number products in the cart
		String stringNumInTheCart = getText(factory.homePage().cartQuantity);
		//convert string in int
		Integer numInTheCart = Integer.valueOf(stringNumInTheCart);
//		Assert.assertTrue(numInTheCart.equals());
//		System.out.println("There are " +  + " in the cart");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	  click(factory.homePage().cartButton);
	  logger.info("User clicked on Cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckout);
		logger.info("User clicked on Proceed to Checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	  click(factory.homePage().addNewAddressLink);
	  logger.info("User clicked Add a new address link for shipping address");
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addCreditOrDebitCard);
		logger.info("User clicked Add a credit card or Debit Card for Payment method");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeYourOrderBtn);
		logger.info("User clicked on Place Your Order");
	}
	@Then("A message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	   Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanksMessage));
	   logger.info("A message should be displayed ‘Order Placed, Thanks’");
	}



}

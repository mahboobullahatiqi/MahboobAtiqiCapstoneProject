package sdet.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sdet.capstone.framework.pages.POMFactory;
import sdet.capstone.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	//

	POMFactory factory = new POMFactory();

	@Then("User verify retail page logo is present")
	public void userVerifyRetailPageLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		logger.info("logo is present");
	}

	// DepartmentSideBar
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allButton);
		logger.info("user clicked on All section");

	}

	@Then("options are present in Shop by Department sidebar Electronics Computers Smart Home Sports Automative")
	public void optionsArePresentInShopByDepartmentSidebar() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomes));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		logger.info("options are present in Shopy by Department sidebar");
	}

//sidebaroutline
	/*
	 * @When("User on {string}") public void userOn(String department) {
	 * clickElementWithJS(getDriver().findElement(
	 * By.xpath("//div[@class = 'sidebar_content-item']//child::span[text() = '" +
	 * department + "']"))); logger.info("user clicked on department " + department
	 * + " option"); }
	 * 
	 * @Then("these options are present in department") public void
	 * theseOptionsArePresentInDepartmentAnd() {
	 * 
	 * if (isElementDisplayed(factory.homePage().tvandVideo)) {
	 * logger.info("tvand video"); } else if
	 * (isElementDisplayed(factory.homePage().videoGames)) {
	 * logger.info("video games"); } else if
	 * (isElementDisplayed(factory.homePage().accessories)) {
	 * logger.info("accessories"); } else if
	 * (isElementDisplayed(factory.homePage().networking)) {
	 * logger.info("smart Home Lighting"); } else if
	 * (isElementDisplayed(factory.homePage().smartHomeLightning)) {
	 * logger.info("smart Home Lighting"); } else if
	 * (isElementDisplayed(factory.homePage().plugsandOutlets)) {
	 * logger.info("plugs and outlets"); } else if
	 * (isElementDisplayed(factory.homePage().athleticClothing)) {
	 * logger.info("athleticClothing"); } else if
	 * (isElementDisplayed(factory.homePage().exerciseFitness)) {
	 * logger.info("exerciese Fitness"); } else if
	 * (isElementDisplayed(factory.homePage().automative)) {
	 * logger.info("automative"); } else if
	 * (isElementDisplayed(factory.homePage().motorCyclePowersports)) {
	 * logger.info("motorCyclePowersports"); } }
	 */

	@When("User on {string}")
	public void userOnDepartment(String department) {

		clickElementWithJS(getDriver().findElement(
				By.xpath("//div[@class = 'sidebar_content-item']//child::span[text() = '" + department + "']")));
		logger.info("user clicked on department " + department + " option");
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable data) {
		List<List<String>> options = data.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(
				"//div[@class = 'sidebar_content-item']//child::span[text() = '" + options.get(0).get(0) + "']"))));
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(
				"//div[@class = 'sidebar_content-item']//child::span[text() = '" + options.get(0).get(1) + "']"))));
		logger.info("options are present in department");

	}

//@AddItemToCart
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smarthome) {
		selectByVisibleText(factory.homePage().catSmartHome, smarthome);
		logger.info("user changed catagory to Smart Home");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String plug) {
		sendText(factory.homePage().searchForItem, plug);
		logger.info("user search for kasa outdoor smart plug");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButtonCatgory);
		logger.info("user clicked on search button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().clickOnItem);
		logger.info("user clicked on the item");
	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		selectByVisibleText(factory.homePage().Qty, qty);
		logger.info("user select quantity 2");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addtoCartButton);
		logger.info("user clicked on add to cart button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String qty) {
		String expectedValue = qty;
		String actualValue = getElementText(factory.homePage().cartyQty);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("the cart icon chnaged to :" + expectedValue);
	}
	// AddiTemToTheCardWithoutAddressAndPayment

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartButton);
		logger.info("user clicked on Cart option");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedButton);
		logger.info("user clicked on Proceed to Checkout button");

	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addAddressNewButton);
		logger.info("user clicked on add new address link for shipping address");

	}

	@Then("User click Add a Credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		clickElementWithJS(factory.homePage().addNewPaymentButton2);
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderNew);
		logger.info("user clicked on place order button");
	}

	@Then("a new message should be displayed {string}")
	public void aNewMessageShouldBeDisplayed(String message) {
		String expectedValue = message;
		String actualValue = getElementText(factory.homePage().orderPlacedMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("order successfully placed, Thanks");
	}

	// placeOrderWithAddress
}

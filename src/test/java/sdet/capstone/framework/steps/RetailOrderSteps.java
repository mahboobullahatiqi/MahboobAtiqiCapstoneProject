package sdet.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sdet.capstone.framework.pages.POMFactory;
import sdet.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// CancelOrder

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderButton);
		logger.info("user clicked on Orders Section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().orderList);
		logger.info("user clicked on First order in the list show details");

	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelButton);
		logger.info("user clicked on Cancel The Order Button");

	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reasonMsg) {
		selectByVisibleText(factory.orderPage().reasonInput, reasonMsg);
		logger.info("user selected the cancelation Reason Bought wrong item");

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderFinal);
		logger.info("user clicked on Cancel Order Button at the end ");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String message) {
		String expectedValue = message;
		String actualValue = getElementText(factory.orderPage().cancellationMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("order has been successfully canceled");

	}
	// @ReturnOrder

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButton);
		logger.info("user clicked on Return Items button");

	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().returnReason, reason);
		logger.info("user selected the Return Reason");

	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOff) {
		selectByVisibleText(factory.orderPage().dropOffService, dropOff);
		logger.info("user selected the dropp off service");

	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderSubmit);
		logger.info("user clicked on Return Order Button");
	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String str) {
		String expectedValue = str;
		String actualValue = getElementText(factory.orderPage().returnMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("Return was successfull");

	}
	// Write Review

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("user clicked on Review button");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String review) {
		sendText(factory.orderPage().headLine, headline);
		sendText(factory.orderPage().reviewText, review);
		logger.info("user wrote Review headline and review");

	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitButton);
		logger.info("user clicked on Add your Review button");

	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String review) {
		String expectedValue = review;
		String actualValue = getElementText(factory.orderPage().reviewMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("review was added successfully");

	}

}

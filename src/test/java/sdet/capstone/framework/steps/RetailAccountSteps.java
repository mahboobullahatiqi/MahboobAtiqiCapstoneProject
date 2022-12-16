package sdet.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sdet.capstone.framework.pages.POMFactory;
import sdet.capstone.framework.utilities.CommonUtility;
import sdet.capstone.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountBTN);
		logger.info("User clicked on Account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameNameValueAndPhonePhoneValue(String fullNameValue, String phoneNumberValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, DataGenerator.addressGenerator(fullNameValue));
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, DataGenerator.addressGenerator(phoneNumberValue));
		logger.info("User updated Name and Phone");
		
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
	    
	}
	@Then("User profile information should be updated")
	public void UserProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().successUpdate);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successUpdate));
		logger.info("Information is updated and user can see the Successfull update message");
	}
	
	//password steps 
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> changePasswordList = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, changePasswordList.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, changePasswordList.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, changePasswordList.get(0).get("confirmPassword"));
		logger.info("User entered previous password and new password and confirm password");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	    click(factory.accountPage().ChangePasswordBtn);
	    logger.info("User clicked on Change Password Button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String givenmessage) {
	  //waitTillPresence(factory.accountPage().passwordMessage);
		String expectedValue= givenmessage;
		String actualValue = getElementText(factory.accountPage().passwordMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info( "successfull message is displayed");
	}
	
	//add payment step
	
	@When("User click on Add a payment method link")
	public void user_click_on_add_a_payment_method_link() {
	   click(factory.accountPage().addPaymentLink);
	   logger.info("user clicked on add payment method");
	   
	}

	@When("User fill Debit or credit card information")
	public void user_fill_debit_or_credit_card_information(DataTable dataTable) {
		List<Map<String, String>> addPayment = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountPage().cardNumberInput, addPayment.get(0).get("cardNumber"));
	    sendText(factory.accountPage().nameonCardInput, addPayment.get(0).get("nameOnCard"));
	    selectByVisibleText(factory.accountPage().monthExpiration, addPayment.get(0).get("expirationMonth"));
	    selectByVisibleText(factory.accountPage().yearExpiration, addPayment.get(0).get("expirationYear"));	 
	    sendText(factory.accountPage().securityCode, addPayment.get(0).get("securityCode"));
	    logger.info("user added card number and card name and selected month and year of expiration");
	    
	}

	@When("User click on Add your card button")
	public void user_click_on_add_your_card_button() {
		click(factory.accountPage().addCard);
		logger.info("user clicked on add card button");
	}
	
	@Then ("a message should be displayed after payment added {string}")
	public void aMessageShouldBeDisplayedAfterPaymentAdded(String message) {
		//waitTillPresence(factory.accountPage().passwordMessage);
		String expectedValue= message;
		String actualValue = getElementText(factory.accountPage().paymentMessage);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info( "successfull message is displayed");
		//String message
	}
	
	//Edit Payment
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	   click(factory.accountPage().editButtonPayment);
	   clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
	   clearTextUsingSendKeys(factory.accountPage().nameonCardInput);
	   clearTextUsingSendKeys(factory.accountPage().securityCode);
	   logger.info("user clicked on Edit option of card section");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
	  List<Map<String, String>> editPayment = data.asMaps(String.class, String.class);
	  sendText(factory.accountPage().cardNumberInput, editPayment.get(0).get("cardNumber"));
	  sendText(factory.accountPage().nameonCardInput, editPayment.get(0).get("nameOnCard"));
	  selectByVisibleText(factory.accountPage().monthExpiration, editPayment.get(0).get("expirationMonth"));
	  selectByVisibleText(factory.accountPage().yearExpiration, editPayment.get(0).get("expirationYear"));	
	  sendText(factory.accountPage().securityCode, editPayment.get(0).get("securityCode"));
	  logger.info("user edited and updated account information");
	  
	  
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	   click(factory.accountPage().updateCardButton);
	}
	
	//Remove Payment
	@When("User click on card options")
	public void userClickOnCard() {
			click(factory.accountPage().masterCardOption);
		logger.info("user clicked on cards option");
		stop(2000);
	}


	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		
	    click(factory.accountPage().removePaymentButton);
	    logger.info("user clicked on remove button");
	    stop(2000);
	}
	
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().payementDetailsRemoved));
		logger.info("payemnt is removed and payment option is empty");
	}	
	//add Address
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addNewAddress);
		logger.info("user clicked on add address option");
	   
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addAddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropDownAddress, DataGenerator.addressGenerator(addAddress.get(0).get("country")));
		sendText(factory.accountPage().fullNameInputAddress, DataGenerator.addressGenerator(addAddress.get(0).get("fullName")));
		sendText(factory.accountPage().phoneNumberAddress, DataGenerator.addressGenerator(addAddress.get(0).get("phoneNumber")));
		sendText(factory.accountPage().streetInputAddress, DataGenerator.addressGenerator(addAddress.get(0).get("streetAddress")));
		sendText(factory.accountPage().apartmentInputAddress, DataGenerator.addressGenerator(addAddress.get(0).get("apt")));
		sendText(factory.accountPage().cityAddress, DataGenerator.addressGenerator(addAddress.get(0).get("city")));
		selectByVisibleText(factory.accountPage().stateAddress, DataGenerator.addressGenerator(addAddress.get(0).get("state")));
		sendText(factory.accountPage().zipCode, DataGenerator.addressGenerator(addAddress.get(0).get("zipCode")));
		
		
	 
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressFinal);
	    
	}
	
	//Edit Address
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().EditAddress);
		clearTextUsingSendKeys(factory.accountPage().fullNameInputAddress);
		clearTextUsingSendKeys(factory.accountPage().phoneNumberAddress);
		clearTextUsingSendKeys(factory.accountPage().streetInputAddress);
		clearTextUsingSendKeys(factory.accountPage().cityAddress);
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		logger.info("user clicked Edit Address Button and remove existing data one by one");
	    
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addressButton);
		logger.info("user clicked on updated address ");
	    
	}
	
	//Remove Address
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.accountPage().removeAddress);
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		//waitTillPresence(factory.accountPage().removeAddress);
		try {
		Assert.assertFalse(isElementDisplayed(factory.accountPage().removeAddress));
		logger.info("address is removed");
		} catch (AssertionError e) {
			logger.info(e.getMessage());
		}
	}
}

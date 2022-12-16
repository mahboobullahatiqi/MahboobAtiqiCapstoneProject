package sdet.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sdet.capstone.framework.pages.POMFactory;
import sdet.capstone.framework.utilities.CommonUtility;

public class SigninSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@Given ("User is on retail website")
	public void userIsOnRetailWebsite () {
		String expectedTitle = "React App";
		String actualTitle = getTitle(); //this method is already written in CommonUtility class
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to" + expectedTitle);
	}
	@When ("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signIn);
		logger.info("user clicked on Sign in option");
	}
	@And ("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailAdd, String passwordInput) {
		sendText(factory.signInPage().emailInput, emailAdd);
		sendText(factory.signInPage().passwordInput, passwordInput);
		logger.info("user entered email" + emailAdd + "and user entered password" + passwordInput);
	   
	}
	@And ("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	   
	}
	@Then ("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().tekschoolLogo));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountOption));
		logger.info("user logged in into account and the tekSchool logo is displayed and account option is displayd");
	}
	
	@When("User click on Create New Account button")
	public void user_click_on_create_new_account_button() {
		click(factory.signInPage().creatAccountButton);
		logger.info("user clicked on Creat New Account buttton");
	    
	}

	@When("User fill the signUp information with below data")
	public void user_fill_the_sign_up_information_with_below_data(DataTable data) {
		List<Map<String, String>> signInData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, signInData.get(0).get("name"));
		sendText(factory.signInPage().emailInputCreatAccount, signInData.get(0).get("email"));
		sendText(factory.signInPage().passwordInputCreatAccount, signInData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput, signInData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");
	
	}

	@When("User click on SignUp button")
	public void user_click_on_sign_up_button() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on SignUp buton ");
	
	}

	@Then("User should be logged into account page")
	public void user_should_be_logged_into_account_page() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().orderLink));
		logger.info("user logged into account page and order is displayed");
	  
	}

}

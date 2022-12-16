package sdet.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdet.capstone.framework.base.BaseSetup;

public class RetailSigninPage extends BaseSetup {
	public RetailSigninPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy (xpath="//a[text()='Sign in']")
	public WebElement signIn;
	
	@FindBy (id = "email")
	public WebElement emailInput;
	
	@FindBy (id = "password")
	public WebElement passwordInput;
	
	@FindBy (id ="loginBtn")
	public WebElement loginButton;
	
	@FindBy (xpath= "//a[text()='TEKSCHOOL']")
	public WebElement tekschoolLogo;
	
	@FindBy (xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@ FindBy (id= "newAccountBtn")
	public WebElement creatAccountButton;
	
	@ FindBy (id= "nameInput")
	public WebElement nameInput;
	
	@ FindBy (id ="emailInput")
	public WebElement emailInputCreatAccount;
	
	@ FindBy (id = "passwordInput")
	public WebElement passwordInputCreatAccount;
	
	@ FindBy (id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@ FindBy (id = "signupBtn")
	public WebElement signUpButton;
	
	@ FindBy (id = "orderLink")
	public WebElement orderLink;
	
}
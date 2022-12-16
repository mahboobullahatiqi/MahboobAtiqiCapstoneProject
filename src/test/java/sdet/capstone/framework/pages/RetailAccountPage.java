package sdet.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage () {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy (id="accountLink")
	public WebElement accountBTN;
	
	@ FindBy (id ="nameInput")
	public WebElement nameInput;
	
	@FindBy (id="personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy (id="personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy (xpath="//div[@class='Toastify']")
	public WebElement successUpdate;
	
	//password 
	
	@FindBy (id = "previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy (id = "newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy (id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy (xpath = "//button[text()='Change Password']")
	public WebElement ChangePasswordBtn;
	
	@FindBy(xpath = "//div[@role='alert']")
	public WebElement passwordMessage;
	
	//Add Payment Method
	
    @FindBy(xpath="//p[text()='Add a payment method']")
    public WebElement addPaymentLink;
    
    @FindBy (id = "cardNumberInput")
    public WebElement cardNumberInput;
    
    @FindBy (id ="nameOnCardInput")
    public WebElement nameonCardInput;
    
    @FindBy(id ="expirationMonthInput")
    public WebElement monthExpiration;
    
    @ FindBy (id="expirationYearInput")
    public WebElement yearExpiration;
    
    @ FindBy (id="securityCodeInput")
    public WebElement securityCode;
    
    @FindBy (id="paymentSubmitBtn")
    public WebElement addCard;
    
    @FindBy (id ="5v9t8gp")
    public WebElement paymentMessage;
    
    //Editpayment
    @FindBy (xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
    public WebElement editButtonPayment;
    
    @FindBy (xpath="//input[@id='cardNumberInput'")
    public WebElement cardNumberPayment;
    
    //@FindBy (name ="expirationMonth")
    //public WebElement expirationDateMonth;
    
    //@FindBy (name="expirationYear")
    //public WebElement expirationDateYear;
    
    //@FindBy (xpath="//input[@id='securityCodeInput']")
    //public WebElement securityCodeInput;
    
    @FindBy (xpath="//button[text()='Update Your Card']")
    public WebElement updateCardButton;
  
    
    //remove payment
    
    @FindBy (xpath="//button[text()='remove']")
    public WebElement removePaymentButton;
    
    @FindBy (xpath="//p[text()='Master Card']")
    public WebElement masterCardOption;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div")
    public WebElement payementDetailsRemoved;
    
    
    //Add Address 
    
    @FindBy (xpath="//div[@class='account__address-new']")
    public WebElement addNewAddress;
    @FindBy (id ="countryDropdown")
    public WebElement countryDropDownAddress;
    
    @FindBy (id ="fullNameInput")
    public WebElement fullNameInputAddress;
    
    @FindBy (id ="phoneNumberInput")
    public WebElement phoneNumberAddress;
    
    @ FindBy (id = "streetInput")
    public WebElement streetInputAddress;
    
    @ FindBy (id = "apartmentInput")
    public WebElement apartmentInputAddress;
    
    @FindBy (id = "cityInput")
    public WebElement cityAddress;
    
    @FindBy (xpath = "//select[@name='state']")
    public WebElement stateAddress;
    
    @FindBy (id= "zipCodeInput")
    public WebElement zipCode;
    
    @FindBy (id="addressBtn")
    public WebElement addYourAddressFinal;
    
    //Edit Address
    
    @FindBy (xpath="//button[text()='Edit'][1]")
    public WebElement EditAddress;
    
    @FindBy(id="addressBtn")
    public WebElement addressButton;
    
    
    //Remove Address
    
    @FindBy(xpath="//Button[text()='Remove']")
    public WebElement removeAddress;
    
	
	
	
	
	
	
	
	

}

package sdet.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
//CancelOrder
	@FindBy (id="orderLink")
	public WebElement orderButton;
	
	@FindBy (xpath="//p[text()='Show Details']")
	public WebElement orderList;
	
	@FindBy (id="cancelBtn")
	public WebElement cancelButton;
	
	@FindBy (id="reasonInput")
	public WebElement reasonInput;
	
	@FindBy (id ="orderSubmitBtn")
	public WebElement cancelOrderFinal;
	
	@FindBy (xpath="//div[@class='cancel__confirm-message']")
	public WebElement cancellationMessage;
	
	//ReturnOrder
	
	@FindBy (id="returnBtn")
	public WebElement returnButton;
	
	@FindBy (id="reasonInput")
	public WebElement returnReason;
	
	@FindBy (id="dropOffInput")
	public WebElement dropOffService;
	
	@FindBy (id="orderSubmitBtn")
	public WebElement returnOrderSubmit;
	
	@FindBy(xpath="//div[@class='return__confirm-message']")
	public WebElement returnMessage;
	
	//WriteReview
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton;
	
	@FindBy (id="headlineInput")
	public WebElement headLine;
	
	@FindBy (id="descriptionInput")
	public WebElement reviewText;
	
	@FindBy (id="reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewMessage;
	
	
}

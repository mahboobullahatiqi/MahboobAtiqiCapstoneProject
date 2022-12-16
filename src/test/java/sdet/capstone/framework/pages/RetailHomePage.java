package sdet.capstone.framework.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdet.capstone.framework.base.BaseSetup;
public class RetailHomePage extends BaseSetup {
    
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    //DepartmentSideBar
    @FindBy(xpath ="//a[@class='top-nav__logo active']") 
	public WebElement logo;
    
    @FindBy (xpath="//button [@id='hamburgerBtn']")
    public WebElement allButton;
    
    @FindBy (xpath = "//span[text()='Electronics']")
    public WebElement electronics;
    
    @FindBy (xpath = "//span[text()='Computers']")
    public WebElement computers;
    
    @FindBy (xpath = "//span[text()='Smart Home']")
    public WebElement smartHomes;
    
    @FindBy (xpath = "//span[text()='Sports']")
    public WebElement sports;
    
    @FindBy (xpath= "//*[@id=\"sidebar\"]/div[2]/div[5]/span")
    public WebElement automative;
    
    //Department Sidebar outline 
    
    @FindBy(xpath="//div[@class = 'sidebar_content-item']//child::span[text()")
     public WebElement shopByAllDepartments;
    
    @FindBy(xpath="//div[@class = 'sidebar_content-item']//child::span[text()")
    public WebElement optionOne;
    
    @FindBy(xpath="//div[@class = 'sidebar_content-item']//child::span[text()")
    public WebElement optionTwo;
    
    
    
    //
    
    @FindBy (xpath="//div[@class='sidebar_content-item']")
    public WebElement sideBarContent;
    
    @FindBy (xpath = "//span[text()='TV & Video']")
    public WebElement tvandVideo;
    
    @FindBy (xpath = "//span[text()='Video Games']")
    public WebElement videoGames;
    
    @FindBy (xpath = "//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy (xpath = "//span[text()='Networking']")
    public WebElement networking;
    
    @FindBy (xpath = "//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLightning;
    
    @FindBy (xpath = "//span[text()='Plugs and Outlets']")
    public WebElement plugsandOutlets;
    
    @FindBy (xpath = "//span[text()='Athletic Clothing']")
    public WebElement athleticClothing;
    
    @FindBy (xpath = "//span[text()='Exercise & Fitness']")
    public WebElement exerciseFitness;
    
    @FindBy (xpath = "//span[text()='Automative Parts & Accessories']")
    public WebElement automativePartsAccessories;
    
    @FindBy (xpath = "//span[text()='MotorCycle & Powersports']")
    public WebElement motorCyclePowersports;
    
   
    
    //addItemToCart
    
    @FindBy (xpath="//select[@id='search']")
    public WebElement catSmartHome;
    
    @FindBy (id="searchInput")
    public WebElement searchForItem;
    
    @FindBy (id="searchBtn")
    public WebElement searchButtonCatgory;
    
    @FindBy (xpath="//p[@class='products__name']")
    public WebElement clickOnItem;
    
    @FindBy(xpath="//select[@class='product__select']")
    public WebElement Qty;
    
    @FindBy (id="addToCartBtn")
    public WebElement addtoCartButton;
    
    @FindBy (id = "cartQuantity")
    public WebElement cartyQty;
    
    
    //addItemToTheCartWithoutAddress
    
    @FindBy (id="cartBtn")
    public WebElement cartButton;
    
    @FindBy(id="proceedBtn")
    public WebElement proceedButton;
    
    @FindBy(id="addAddressBtn")
    public WebElement addAddressNewButton;
    
    @FindBy (xpath="//*[@id=\"addPaymentBtn\"]")
    public WebElement addNewPaymentButton2;
      
    @FindBy (xpath="//button[text()='Place Your Order']")
    public WebElement placeOrderNew;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/p")
    public WebElement orderPlacedMessage;
    
    //placeOrderWithAddress
    
    
    
    
    

    
    
}
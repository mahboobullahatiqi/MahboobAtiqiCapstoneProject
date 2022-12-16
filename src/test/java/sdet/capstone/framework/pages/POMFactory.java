package sdet.capstone.framework.pages;
import sdet.capstone.framework.base.BaseSetup;


public class POMFactory extends BaseSetup {
    private RetailHomePage homePage;
    private RetailSigninPage signInPage;
    private RetailAccountPage accountPage;
    private RetailOrderPage orderPage;
    
    public POMFactory() {
        this.homePage = new RetailHomePage();
        this.signInPage=new RetailSigninPage();
        this.accountPage= new RetailAccountPage();
        this.orderPage = new RetailOrderPage();
    }
    
    public RetailHomePage homePage() {
        return this.homePage;
    }
    public RetailSigninPage signInPage() {
		return this.signInPage;
	}
    
    public RetailAccountPage accountPage() {
    	return this.accountPage;
    }
    
    public RetailOrderPage orderPage() {
    	return this.orderPage;
    	
    }
}
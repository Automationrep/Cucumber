package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	
	public PageObjectManager(WebDriver driver) {
		
		
		this.driver =driver;
		
	}
	
	
	
	public CheckOutPage checkoOutPage()
	{
		
		return new CheckOutPage(driver);
		
		
	}
	
	public LandingPage landingPage()
	{
		landingPage =new LandingPage(driver);
		
		return landingPage;
		
		
	}
	
	public OffersPage offersPage()
	{
		
		return new OffersPage(driver);
		
		
	}
	
	
	

}

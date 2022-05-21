package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	public String landingpageproductname;
	
	
	public LandingPageStepDefinitions(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.landingPage();
		
		
	}
	
	
	
	
	
	@Given("^user is on greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
		
		
		String text =landingPage.gettitle();
		Assert.assertEquals("GreenKart - veg and fruits kart", text);
		
    }

    @When("^user search with shortname (.+) and extracted the product$")
    public void user_search_with_shortname_and_extracted_the_product(String name) throws Throwable {
    	
    	landingPage.search(name);
    	Thread.sleep(3000);
    	landingpageproductname = landingPage.getveggietext();
    	landingPage.addtocart();
    	landingPage.cartbutton();
    	landingPage.checkoutbutton();
        
    }



}

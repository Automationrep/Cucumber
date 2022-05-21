package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticePageDefinitions {
	
	
	
	
	@Given("^enter username in search$")
    public void enter_username_in_search() throws Throwable {
		
		System.out.println("User details are entered");
        
    }

    @When("^below details are entered$")
    public void below_details_are_entered(DataTable data) throws Throwable {
    	
    	List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	
        
    }

    @Then("^details displayed sucessfully$")
    public void details_displayed_sucessfully() throws Throwable {
    	
    	System.out.println("details are displaying");
        
    }
    
    @Given("^To check user account$")
    public void to_check_user_account() throws Throwable {
    	
    	System.out.println("user account checked");
        
    }

    @When("^details are entered$")
    public void details_are_entered() throws Throwable {
    	
    	System.out.println("details are entered");
        
    }

    @Then("^Sucessfull message should come$")
    public void sucessfull_message_should_come() throws Throwable {
    	
    	System.out.println("sucessfull message received");
        
    }

    @And("^username entered is \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void username_entered_is_something_and_password_as_something(String uname, String pwd) throws Throwable {
    	
    	
    	System.out.println("username entered is--"+uname+"--and password is--"+pwd);
       
    }
    
    @Given("^user open the url$")
    public void user_open_the_url() throws Throwable {
        System.out.println("url opened");
    }

    @When("^user enter (.+) and password as (.+)$")
    public void user_enter_and_password_as(String name, String pwd) throws Throwable {
        System.out.println(name+"    "+pwd);
    }

    @Then("^login should be sucessfull and landing page is opened$")
    public void login_should_be_sucessfull_and_landing_page_is_opened() throws Throwable {
        System.out.println("login sucessfull and landing page opened");
    }
    
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	
    	System.out.println("Background given");
       
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	
    	System.out.println("Background When");
        
    }

    @Then("^check browser is started$")
    public void check_browser_is_started() throws Throwable {
    	
    	System.out.println("Background Then");
        
    }

}

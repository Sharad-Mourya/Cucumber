package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^User navigates to URL$")
	public void user_navigates_to_URL(){
		System.out.println("User navigates to URL");
	}
	
	@When("^User enters username and password and click on login$")
	public void user_enters_username_and_password_and_click_on_login(){
		System.out.println("User has enetered cred");
	}
	
	@Then("^User is on Home Page$")
	public void user_is_on_home_page(){
		System.out.println("navigated to home page");
	}
	
}

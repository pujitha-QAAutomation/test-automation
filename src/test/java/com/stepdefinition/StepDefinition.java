package com.stepdefinition;

import static com.bdd.variables.GlobalVariables.*;
import io.cucumber.java.en.Then;


public class StepDefinition {	
	

	@Then("User should redirected to home page")
	public void user_should_redirected_to_home_page() {
		System.out.println("Step4: user is in homepage");
		cdriver.close();
	    
	}
	
	@Then("User should able to select required option from configuration drop down")
	public void user_should_able_to_select_required_option_from_configuration_drop_down() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

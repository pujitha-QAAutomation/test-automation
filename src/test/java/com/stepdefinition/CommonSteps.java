package com.stepdefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static com.bdd.variables.GlobalVariables.*;
import static com.bdd.implementation.AppAccess.*;

public class CommonSteps {
	
	@Given("User enters into the application")
	public void user_enters_into_the_application() {
		System.out.println("Step1: user is in login page");		
		accessApp();
	}
	
	@When("User  enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("Step2: user enter username and password");		
		cdriver.findElement(By.id("txtUsername")).sendKeys("admin");
		cdriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3: user clicked on login button");
		cdriver.findElement(By.id("btnLogin")).click();
	}

	
}

@dropdownvalidations
Feature: Validation of drop down fucntionality

@PIMRelatedDropDown
Scenario: Validation of configuration drop down
Given User enters into the application   
When User  enter valid username and password
And click on login button
Then User should redirected to home page
And User should able to select required option from configuration drop down
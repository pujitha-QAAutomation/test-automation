
Feature: Test login functionality of orangeHRM application
 
  Scenario: Verify valid login
    Given User enters into the application  
    When User  enter valid username and password
    And click on login button
    Then User should redirected to home page    
    
 Examples:
    | username   | password |
    | admin | admin123 |
    
    


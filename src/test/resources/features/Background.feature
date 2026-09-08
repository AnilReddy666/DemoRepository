
Feature: Background demonstration

  Background:
    Given user is on the login page
 @Smoke
  Scenario: Login with valid credentials
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then user should see the Products page
@Regression
  Scenario: Login with invalid credentials
    When user enters "invalid_user" and "invalid_password"
    And user clicks on login button
    Then user should see an error message

Feature: Login Functionality
  @Smoke
Scenario: Login with valid credentials
Given user is on the login page
When user enters valid username and password
  | username        | password     |
  | standard_user   | secret_sauce |
  | locked_out_user | secret_sauce |
  | problem_user    | secret_sauce |
And user clicks on login button
Then user should see the Products page


  Scenario: Login with Invalid Credentials
    Given user is on the login page
    When user enters invalid username and password
    And user clicks on login button
    Then user should see an error message
    Scenario Outline: Login with different credentials
      Given user is on the login page
      When user enters "<username>" and "<password>"
      And user clicks on login button
      Examples:
        | username        | password       |
        | standard_user   | secret_sauce   |
        | locked_out_user | secret_sauce   |
        | invalid_user    | invalid_password |
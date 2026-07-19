Feature: Registration Form Filling
  Scenario: Entering the user details
    Given : user is in login page
    When the user clicks on registration button
    When : the user enters the Registration details
    And : the user clicks on submit button
    Then : the registration should be successfull

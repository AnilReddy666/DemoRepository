Feature: DataTable practise
 # Scenario: Read usernames using DataTable
  #  When  user provides login details
     # | username | standard_user |
     # | password | secret_sauce  |



     Scenario Outline: Login using structured user data
       Given  user is on the SauceDemo login page
       When user provides the following login details
         | username | <username> |
         | password | <password> |
       Then user should see the products page
     Examples:
       | username      | password     |
       | standard_user | secret_sauce |
       | problem_user  | secret_sauce |
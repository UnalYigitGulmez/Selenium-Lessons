Feature: Login

  Background: login process until clicking login
    Given go to login page
    And types valid username
    And types valid password
    When user clicks the login button

  @regression @smoke
  Scenario: Verify that login with valid username and valid password
    Then assert login is successful

  @regression
  Scenario: Verify that login with invalid username and valid password
    Then assert login is unsuccessful

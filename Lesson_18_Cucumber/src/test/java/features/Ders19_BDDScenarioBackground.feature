Feature: Login3
  Background:
    Given go to login page
@smoke
  Scenario: Verify that user can login to the Saucedemo website
    And types valid username
    And types valid password
    When user clicks the login button
    Then assert login is successful

@regression @P4
  Scenario Outline: Verify that user can login to the Saucedemo website with Scenario Background
    And user types username as "<username>"
    And user types password as "<password>"
    When user clicks the login button
    Then assert login is successful
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |standard_user1|secret_sauce2|
      |Baris|secret_sauce2|


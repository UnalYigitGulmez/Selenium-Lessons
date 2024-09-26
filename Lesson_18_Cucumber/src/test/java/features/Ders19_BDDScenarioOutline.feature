Feature: Login2
  Scenario Outline: Verify that user can login to the Saucedemo website with Scenario Outline
    Given go to login page
    And user types username as "<username>"
    And user types password as "<password>"
    When user clicks the login button
    Then assert login is successful
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |standard_user1|secret_sauce2|
      |Baris|secret_sauce2|

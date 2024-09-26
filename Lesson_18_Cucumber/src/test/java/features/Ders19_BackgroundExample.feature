Feature: Account Management

Background:
    Given browser is "Firefox"
    And I am logged into the system
    And user allows cookies


    @baris
  Scenario: View Account Details
    When I navigate to the account page
    Then I should see my account details

  Scenario: Edit Account Information
    When I navigate to the account settings
    And I update my email address
    Then I should see the updated email address in my profile

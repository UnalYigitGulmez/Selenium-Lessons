Feature: Scenario Outline Example
@login_scenario @p3
  Scenario Outline: Successful Login with valid credentials
  Given I navigate to the login page
  When I enter "<username>" and "<password>"
  And I click the login button
  Then I should be redirected to the dashboard

  Examples:
    | username    | password   |
    | user1       | pass1      |
    | user2       | pass2      |
    | admin       | admin123   |
    | baris       | 12345      |

  Scenario Outline: Login
    Given browser is "<browser>" , "<usertype>" and "<location>"
    And navigate to Orion Innovation home page
    When click About Us
    Then company address is seen
    Examples:
      | browser | usertype | location |
      | Chrome  | admin    | Turkey   |
      | Firefox | super    | Serbia   |
      | Safari  | root     | India    |

  Scenario: Login
    Given browser is Chrome , admin and Turkey
    And navigate to Orion Innovation home page
    When click About Us
    Then company address is seen

  Scenario: Login
    Given browser is Firefox , super and Serbia
    And navigate to Orion Innovation home page
    When click About Us
    Then company address is seen




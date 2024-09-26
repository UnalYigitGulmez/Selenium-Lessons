Feature: subproducts images

  @ayakkabi @subproduct @P1 @Regression @Smoke
  Scenario: 1 Verify that First subproduct is ayakkabi
    Given browser is Firefox
    When user goes to shopping page
    And user clicks Products panel
    And user clicks Giyim
    Then user observes the first product
    Then user observes the ayakkabi

    @corap @sub-product @P3 @Regression @disabled @blocked
  Scenario: 2 Verify that Second subproduct is çorap
    Given browser is Firefox
    When user goes to shopping page
    And user clicks Products panel
    And user clicks Giyim
    Then user observes the first product
    Then user observes the çorap
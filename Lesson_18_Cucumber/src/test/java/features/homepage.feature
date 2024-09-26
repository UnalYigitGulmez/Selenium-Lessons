Feature: login
  Scenario: login test scenario
  Given chrome browser is used
  When user navigates to the login page
  And user types username on the username field
  And user types password on the password field
  And user clicks login button
  Then user can login the application
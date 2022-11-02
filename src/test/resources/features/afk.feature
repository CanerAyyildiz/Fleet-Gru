 @FLEETG-1430 @afk
Feature: Log out Functionality Text Execution

  Background:
    Given user is on the login page

  @FLEETG-1531
  Scenario: afk
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks to login button
    And user will not take action for 3 minutes
    Then user should see the login page again
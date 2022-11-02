@closeTab
Feature: Log out Functionality Text Execution

  Background:
    Given user is on the login page


  Scenario: Close tab
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks to login button
    And close tab of page fleet-gru
    And user is on the login page
    Then user should see the login page again
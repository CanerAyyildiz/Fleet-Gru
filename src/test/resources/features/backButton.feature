@FLEETG-1430 @backbttn
Feature: Log out Functionality Text Execution

  Background:
    Given user is on the login page

@FLEETG-1530
  Scenario: back button
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks to login button
    And user click to profil menü
    And user clicks to log out button
    And user clicks to back button
    Then user should see login page


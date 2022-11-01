 @FLEETG-1451
Feature:Login Functionality Text Execution


  Background:
    Given user is on the login page

   @FLEETG-1452
  Scenario Outline: Login as a all users
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user clicks login button
    Then user should see "<expectedHeader>"

    Examples: Valid Credentials
      | username        | password    | expectedHeader  |
      | user1           | UserUser123 | Quick Launchpad |
      | storemanager51  | UserUser123 | Dashboard       |
      | salesmanager101 | UserUser123 | Dashboard       |

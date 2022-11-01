@FLEETG-1451
Feature:Login Functionality Text Execution

  Background:  For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @FLEETG-1448
  Scenario Outline: Enter Key
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user press the enter key
    Then user should see "<expectedHeader>"

    Examples: Valid Credentials
      | username        | password    | expectedHeader  |
      | user1           | UserUser123 | Quick Launchpad |
      | storemanager51  | UserUser123 | Dashboard       |
      | salesmanager101 | UserUser123 | Dashboard       |

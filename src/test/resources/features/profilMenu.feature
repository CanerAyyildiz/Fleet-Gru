@profilMenu @FLEETG-1451
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page

  @FLEETG-1449
  Scenario Outline: Profil menu
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user press the enter key
    Then user should see own username "<ownUsername>"

    Examples: Valid Credentials
      | username        | password    | ownUsername |
      | user1           | UserUser123 | John Doe    |
      | storemanager51  | UserUser123 | John Doe    |
      | salesmanager101 | UserUser123 | John Doe    |

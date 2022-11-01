@FLEETG-1451
Feature:Login Functionality Text Execution

  Background:  For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @FLEETG-1443
  Scenario Outline: Login as a all users invalid credentials
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user clicks login button
    Then user should see  "Invalid user name or password."

    Examples: Valid Credentials
      | username       | password    |
      | user1          | UserUser12  |
      | storemanager   | UserUser123 |
      | salesmanager   | UserUser    |


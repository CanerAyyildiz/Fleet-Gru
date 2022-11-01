@valid @FLEETG-1451
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page


  @FLEETG-1444
  Scenario Outline: user should see warning  message
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user clicks login button
    Then user should see validation message "<validationMessage>"


    Examples:
      | username | password    | validationMessage           |
      |          | UserUser123 | Please fill out this field. |
      |          |             | Please fill out this field. |



  @FLEETG-1444
  Scenario: validation message
    When user enters to username "user1"
    And user enters to password ""
    And user clicks login button
    Then user should see message "Please fill out this field."





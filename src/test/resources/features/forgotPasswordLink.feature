@FLEETG-1451
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page


  @FLEETG-1446
    Scenario: Forgot Password Link
      When user clicks to Forgot your password? link
      Then user should see "Forgot Password" page
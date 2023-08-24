Feature: Login Functionality

  @Smoke @Regression
  Scenario: Login Process
    Given Open Application
    When Close the popUP
    And Click on the hesabim button
    And Enter the valid email and password
    And Click on the girisYap button
    Then Verify that the user should be logged in successfully
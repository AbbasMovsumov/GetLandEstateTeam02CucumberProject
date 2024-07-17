
@US02
Feature:Customer Should Be Able To Login With Valid Datas
  Background:
    Given the customer navigates to the "url" website
    When the customer clicks on the login link

  Scenario: TC01 Positive Scenario
    And customer enters own "email" in the email field
    And customer enters own "password" in the password field
    And customer clicks on the login button
    Then verify that login is complete
    And the customer closes the application

  Scenario: TC02 Negative Scenario
    And customer enters own email in the email field
    And customer tries to opens a login by leaving the password field blank
    Then verify that the Password is required message is visible
    And the customer closes the application

  Scenario: TC03 Negative Scenario
    And customer tries to opens a login by leaving the email field blank
    And customer enters own "password" in the password field
    Then verify that the Email is required message is visible
    And the customer closes the application

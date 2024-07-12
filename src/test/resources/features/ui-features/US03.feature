@US03
Feature: US03 - Be able to view and update customer profile information
  Scenario: TC01 - View and change their profile information by clicking on the My Profile button
    Given user goes to "https://www.getlandestate.com/"
    When the user clicks the Login button
    And the user enters customer credentials in the Email and Password fields


@US03
Feature: US03 - Be able to view and update customer profile information

  Background:
    Given the user has an active customer account

  Scenario: TC01 - View and change their profile information by clicking on the My Profile button
    Given
    And the user clicks the Login button
    And clicks on the human symbol
    And the user clicks the "My Profile" option
    Then the user should be on the profile page
    And the user should see the registered data in the "First Name" field as "Rumeysa"
    When When the user updates the "First Name" field with "Rumeys"












@US04
Feature: US04 User (Admin, Manager, Customer) should be able to view the page in 5 different languages

#  Scenario Outline: TC01 Ability to view the page in different languages as Customer
#    Given user goes to "url"
#    When user clicks to Login
#    And user login as "Customer" role
#    And the user clicks on the language selection button
#    And the user selects "<language>"
#    Then the page should be displayed in "<language>"
#
#    Examples:
#      | language |
#      | Turkish  |
#      | English  |
#      | French   |
#      | German   |
#      | Spanish  |
#

#    Then the user should see the "Create Property" text
#    And the footer text at the bottom of the page should be in English, containing "All rights reserved"

  Background: Seing different languages
    Given user goes to "url"
    When user clicks to Login

  Scenario: TC01 Ability to view the page in English as Customer
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects englishOption
    Then the page should be displayed in englishOption

  Scenario: TC02 Ability to view the page in Turkish as Customer
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects turkishOption
    Then the page should be displayed in turkish

  Scenario: TC03 Ability to view the page in French as Customer
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects frenchOption
    Then the page should be displayed in french

  Scenario: TC04 Ability to view the page in Deutsch as Customer
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects germanOption
    Then the page should be displayed in deutsch

  Scenario: TC05 Ability to view the page in Spanish as Customer
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects spanishOption
    Then the page should be displayed in spanish

  Scenario: TC06 Ability to view the page in English as Admin
    And user login as "Admin" role
    And the user clicks on the language dropdown menu
    And the user selects englishOption
    Then the page should be displayed in englishOption

  Scenario: TC07 Ability to view the page in Deutsch as Admin
    And user login as "Admin" role
    And the user clicks on the language dropdown menu
    And the user selects germanOption
    Then the page should be displayed in deutsch

  Scenario: TC08 Ability to view the page in Turkish as Manager
    And user login as "Manager" role
    And the user clicks on the language dropdown menu
    And the user selects turkishOption
    Then the page should be displayed in turkish

  Scenario: TC09 Ability to view the page in French as Manager
    And user login as "Manager" role
    And the user clicks on the language dropdown menu
    And the user selects frenchOption
    Then the page should be displayed in french

  Scenario: TC10 Displaying the sections on the Create Property page in the selected language
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects turkishOption
    And the user clicks to ilan ekle button
    Then the user should see datas as Turkish

  Scenario: TC11 Displaying the sections on the Control Panel page in the selected language
    And user login as "Admin" role
    And user clicks Back to Site button
    And the user clicks on the language dropdown menu
    And the user selects turkishOption
    And the user clicks to user navigate button
    And the user clicks to control panel button
    Then the user should see the page as Turkish

  Scenario: TC12 Display of adverts information in the selected language
    And user login as "Customer" role
    And the user clicks on the language dropdown menu
    And the user selects turkishOption
    And the user clicks to properties button
    And the user clicks to an advert
    Then the user should see the page Turkish






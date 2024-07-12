Feature: Rent advertisement as a Manager

  Background: Landing New Advert page
    Given user login as "Manager" role
    When user clicks Back to Site button
    And user clicks on Create Property button on Home page

  Scenario: TC01_Manager should be able to create renting advert
    And user set "title" as "Kiralik Ev Ilani" on advert page
    And user set "description" as "Dublex, dag manzarali" on advert page
    And user select "price" as "" on advert page
    And user set "title" as "ev" on advert page
    And user set "title" as "ev" on advert page
    And user set "title" as "ev" on advert page
    And user select "" as "" on advert page
    And user upload the image "" on advert page
    And user clicks create button on advert page
    Then user see the success message as "Advert created succesfully"


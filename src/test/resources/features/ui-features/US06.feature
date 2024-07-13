Feature: Rent advertisement as a Manager

  Background: Landing New Advert page
    Given user login as "Manager" role
    When user clicks Back to Site button
    And user clicks on Create Property button on Home page

  Scenario: TC01_Manager should be able to create renting advert
    And user set "Title" as "House Rent Advert" on advert page
    And user set "Description" as "Dublex, mountain view" on advert page
    And user set "Price" as "2000" on advert page
    And user select "Advert Type" as "Rent" on advert page
    And user select "Category" as "House" on advert page
    And user select "Country" as "France" on advert page
    And user select "City" as "Ain" on advert page
    And user select "District" as "Amberieu-en-Bugey" on advert page
    And user set "Adress" as "Rue de la Petite Croze" on advert page
    And user set "Size" as "122" on advert page
    And user set "Bedrooms" as "3" on advert page
    And user set "Bathrooms" as "2" on advert page
    And user select "Garage" as "Yes" on advert page
    And user set "Year of Build" as "1950" on advert page
    And user select "Furniture" as "No" on advert page
    And user set "Maintenance Fee" as "100" on advert page
    And user select "Terrace" as "Yes" on advert page
    And user upload the image "RentHouse.jpg" on advert page
    And user clicks create button on advert page
    Then user see the success message as "Advert created succesfully"

Scenario:
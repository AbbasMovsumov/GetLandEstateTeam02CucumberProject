@US06
Feature: Rent advertisement as a Manager

  Background: Landing New Advert page
    Given user login as "Manager" role
    When user clicks Back to Site button
    And user clicks on Create Property button on Home page

@smokeTest
  Scenario: TC01_Manager should be able to create renting advert
    And user set "Title" as "House Rent Advert" on advert page
    And user set "Description" as "Dublex, mountain view" on advert page
    And user set "Price" as "2000" on advert page
    And user select "Advert Type" as "Rent" on advert page
    And user select "Category" as "House" on advert page
    And user select "Country" as "France" on advert page
    And user select "City" as "Ain" on advert page
    And user select "District" as "Amberieu-en-Bugey" on advert page
    And user set "Address" as "Rue de la Petite Croze" on advert page
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
    Then user see the success message as "Advert created successfully"
    Then user verify the image uploaded successfully on my adverts page
    Then assert all


  Scenario: TC02_Error messages should appear when title, description and address boxes are left empty.
    And  user set "Title" as "" on advert page
    And  user set "Description" as "" on advert page
    And  user set "Address" as "" on advert page
    #to see error need to click somewhere on page
    And  user set "Description" as "" on advert page
    Then user see error text as "Enter a title" for "Title" on advert page
    Then user see error text as "Enter a description" for "Description" on advert page
    Then user see error text as "newAdvertPageTranslations.requiredAddress" for "Address" on advert page
    And assert all


  Scenario: TC03_Error message should appear when an image over 3 MB is uploaded.
    And user upload the image "RentHouseOver3MB.jpg" on advert page
    Then user see error text as "Each image should be a maximum of 3 MB" for "Upload image" on advert page


  Scenario: TC04_The Create button should not be clickable if the properties fields are not filled in.
    And user set "Title" as "House Rent Advert" on advert page
    And user set "Description" as "Dublex, mountain view" on advert page
    And user set "Price" as "2000" on advert page
    And user select "Advert Type" as "Rent" on advert page
    And user select "Category" as "House" on advert page
    And user select "Country" as "France" on advert page
    And user select "City" as "Ain" on advert page
    And user select "District" as "Amberieu-en-Bugey" on advert page
    And user set "Address" as "Rue de la Petite Croze" on advert page
    And user set "Size" as "" on advert page
    And user set "Bedrooms" as "" on advert page
    And user set "Bathrooms" as "" on advert page
    And user select "Garage" as "Yes" on advert page
    And user set "Year of Build" as "" on advert page
    And user select "Furniture" as "No" on advert page
    And user set "Maintenance Fee" as "" on advert page
    And user select "Terrace" as "Yes" on advert page
    And user upload the image "RentHouse.jpg" on advert page
    Then user verify that create button is not clickable


  Scenario Outline:TC05 Create button should be disabled unless all the fields are not filled
    And user fill the fields "<Title>", "<Description>","<Price>","<Advert Type>","<Country>" ,"<City>","<District>""<Address>"
    And user upload the image "RentHouse.jpg" on advert page
    Then user verify that create button is not clickable
    #And user wait "1" seconds

    Examples:
      | Title                  | Description | Price | Advert Type | Country | City | District          | Address           |
      |                        | adkgkvb     | 120   | Rent        | France  | Ain  | Amberieu-en-Bugey | sorma be kardesim |
      | hayaller ve gercekler  |             | 140   | Rent        | France  | Ain  | Amberieu-en-Bugey | sananes           |
      | adfhjk                 | khgk        |       | Rent        | France  | Ain  | Amberieu-en-Bugey | sorma be kardesim |
      | sendevarya             | adkgkvb     | 120   |             | France  | Ain  | Amberieu-en-Bugey | sorma be kardesim |
      | gorelimneyler          | adkgkvb     | 120   | Rent        | France  | Ain  | Amberieu-en-Bugey | sorma be kardesim |
      | neylerseguzel          | adkgkvb     | 120   | Rent        |         | Ain  | Amberieu-en-Bugey | sorma be kardesim |
      | suphenmivar            | adkgkvb     | 120   | Rent        | France  |      | Amberieu-en-Bugey | sorma be kardesim |
      | ogrenelimhayirliseyler | adkgkvb     | 120   | Rent        | France  | Ain  |                   | sorma be kardesim |

  Scenario: TC06_Renting advert cannot be created with invalid data
    And user set "Title" as "House Rent Advert" on advert page
    And user set "Description" as "Dublex, mountain view" on advert page
    And user set "Price" as "2000" on advert page
    And user select "Advert Type" as "Rent" on advert page
    And user select "Category" as "House" on advert page
    And user select "Country" as "France" on advert page
    And user select "City" as "Ain" on advert page
    And user select "District" as "Amberieu-en-Bugey" on advert page
    And user set "Address" as "Rue de la Petite Croze" on advert page
    And user set "Size" as "-120" on advert page
    And user set "Bedrooms" as "-5" on advert page
    And user set "Bathrooms" as "-2" on advert page
    And user select "Garage" as "Yes" on advert page
    And user set "Year of Build" as "-45" on advert page
    And user select "Furniture" as "No" on advert page
    And user set "Maintenance Fee" as "-45" on advert page
    And user select "Terrace" as "Yes" on advert page
    And user upload the image "RentHouse.jpg" on advert page
    Then user verify that create button is not clickable

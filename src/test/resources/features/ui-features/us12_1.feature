@home_page_feature
Feature: User search

  @user_search_sale_ad
  Scenario Outline:Being able to search for sale adverts without registration

    When user navigates to the home page
    And user verifies to the homepage
    Then user clicks search item
    And user enters "<word>"
    And user clicks search button
    Then user clicks Minimum button
    Then user enters minimumValue as "<minimumValue>"
    Then user clicks Maximum button
    Then user enters maximumValue as "<maximumValue>"
    Then user clicks Advert Type button
    And user chooses "<Sale>"Advert Type
    Then user clicks Category button
    Then user chooses "<House>" Category
    Then user clicks Country button
    And user chooses "<Türkiye>" Country
    Then user clicks City button
    Then user chooses "<Antalya>" City
    Then user clicks District button
    And user chooses "<Alanya>" District
    Then user clicks a Search button
    Then user sees picture
    Then user clicks on the Picture
    And user sees Description and Location information



    Examples: user info
      |word |minimumValue|maximumValue |
      |Hause|   100 000  |   500 000    |
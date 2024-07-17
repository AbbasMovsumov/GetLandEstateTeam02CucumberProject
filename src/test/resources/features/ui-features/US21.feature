Feature:US21_Admin should able to view contact messages

  Background: Sending  a contact message and Landing Contact Messages page

    And user login as "Admin" role
    When user clicks ContactMessages


  Scenario: user can view and delete contact messages as admin
    And user enter "murvet" keyword in searchbox
    And user clicks on "search" button on Contact Messages page
    Then user see the expected mail in the contact messages
    And user clicks on  "first mail" button on Contact Messages page
    And user clicks on  "delete" button on Contact Messages page
    Then user verify the mail is deleted on Contact Messages page

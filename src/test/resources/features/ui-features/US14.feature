@US14
Feature: Manager create tour request for external property
  Background: Navigating to New Tour Request page
    Given User navigates to the specified URL and logs in as "Manager" role
    When User clicks on the Login button
    #When User clicks on the Back to Site button
    When User clicks on the Tour requests button

Scenario: TC14_Manager should be able to create a tour request for a property not owned by them
Given User clicks on the Properties button
When User clicks on any property
And User enters any date in the Tour Date field
And User enters any time in the Tour Time field
And User clicks on the Submit a tour request button
Then User verifies that the message "TourRequest created successfully" is displayed, indicating a tour request has been created
And User closes the page


@US01
Feature:Smoke_Testing
  Background:
    Given the customer navigates to the "url" website
    When the customer clicks on the register link

  Scenario: TC01 Positive scenario
    And customer creates a new registration with own information firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
    And customer clicks on the privacy policy checkbox
    And customer clicks on the submit button
    Then verify that registration is complete
    And the customer closes the application

  Scenario: TC02 Negative scenario
    And customer tries to opens a registration by leaving the firstname field blank firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
    And customer clicks on the privacy policy checkbox
    Then verify that the First name is required warning is visible
    And the customer closes the application

#  Scenario: TC03 Negative scenario
#    And customer tries to opens a registration by leaving the lastname field blank firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Last name is required warning is visible
#    And the customer closes the application
#
#  Scenario: TC04 Negative scenario
#    And customer tries to opens a registration by leaving the phone field blank firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Phone is required warning is visible
#    And the customer closes the application
#
#  Scenario: TC05 Negative scenario
#    And customer tries to opens a registration by leaving the email field blank firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Email is required warning is visible
#    And the customer closes the application
#
#  Scenario: TC06 Negative scenario
#    And customer tries to register with invalid email, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    And customer clicks on the submit button
#    Then verify that the Invalid email warning is visible
#    And the customer closes the application
#
#  Scenario: TC07 Negative scenario
#    And customer tries to opens a registration by leaving the password field blank, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Password is required warning is visible
#    And the customer closes the application
#
#  Scenario: TC08 Negative scenario
#    And customer tries to opens a registration by leaving the Confirm password field blank, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Confirm password is required warning is visible
#    And the customer closes the application
#
#  Scenario: TC09 Negative scenario
#    And customer should not register with a seven character password, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the At least 8 characters warning is visible
#    And the customer closes the application
#
#  Scenario: TC10 Positive scenario
#    And customer should be able to register with a nine character password, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    And customer clicks on the submit button
#    Then verify that registration is complete with 9 characters password
#    And the customer closes the application
#
#  Scenario: TC11 Positive scenario
#    And customer creates a new registration with own information firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    And customer clicks on the submit button
#    Then verify that the Success message is visible
#    And the customer closes the application
#
#  Scenario: TC12 Positive scenario
#    And customer creates a new registration with own information firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    And customer clicks on the submit button
#    Then verify that the Your registration has been completed successfully. Please to activate your account, click on the activation link sent to your e-mail. message is visible
#    And the customer closes the application
#
#  Scenario: TC13 Positive scenario
#    And customer shouldn't be able to register with a verified phone number, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    And customer clicks on the submit button
#    Then verify that the Phone number already exists message is visible
#    And the customer closes the application
#
#  Scenario: TC14 Positive scenario
#    And customer shouldn't be able to register with a different confirm password, firstname "<firstname>", lastname "<lastname>", phone "<phone>", email "<email>", enter_password "<enter_password>", confirm_password "<confirm_password>"
#    And customer clicks on the privacy policy checkbox
#    Then verify that the Passwords must match message is visible
#    And the customer closes the application
#



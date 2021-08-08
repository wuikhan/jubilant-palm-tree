Feature: Test login functionality
  I want to use test the login functionality using valid and in valid credentials

  Background: 
    Given I open chrome browser
    And I visit my application

  @sprint3 @accounts
  Scenario: Using valid credentials I should be able to login to my application
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I close the browser

  @sprint3
  Scenario: Using in-valid credentials, I should not be able to login to my application
    And I enter "test.fake@gmail.com.test" as username
    And I enter "WrondPassword" as password
    When I click the login button
    Then I should see an error message
    And I close the browser

   @sprint3
  Scenario: Using anounymous user I should be able to visit the application
    And I close the browser

   @sprint3
  Scenario: Using in-valid credentials, I should not be able to login to my application
    And I enter "test.fake@gmail.com.test" as username
    And I enter "WrondPassword" as password
    When I click the login button
    Then I should see an error message
    And I close the browser

   @sprint3
  Scenario: Create Account using Data Table
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I create and save the Account
      | Account Name | Account Number | Account Site     | Active | Annual Revenue | Account Source |
      | Waqas 123    |          12345 | www.codegator.us | Yes    |         100000 | Web            |
    And I click the "Edit" button
    And I should see the following values for the "00N2E00000D7LOy" field
      | --None-- |
      | No       |
      | Yes      |
    And I should see the following values for the "AccountSource" field
      | --None--         |
      | Web              |
      | Phone Inquiry    |
      | Partner Referral |
      | Purchased List   |
      | Other            |

  @background
  Scenario Outline: Create and Save Account records
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I click the "Accounts" tab
    And I click the "New" button
    And I enter "<accountName>" in the account name field
    And I click the "Save" button
    And I close the browser

    Examples: 
      | accountName |
      | Waqas       |

  @background
  Scenario: Verify active drop down field is present
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I click the "Accounts" tab
    And I click the "New" button
    And I close the browser

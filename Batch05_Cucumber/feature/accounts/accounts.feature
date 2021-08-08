Feature: As a user , I should be able to verify and create accounts

  @regression @sprint1 @smoketest @accounts
  Scenario: Create Account using Data Table
    And I visit my application
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

  @accounts @regression @sprint2
  Scenario Outline: Create and Save Account records
    And I visit my application
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I click the "Accounts" tab
    And I click the "New" button
    And I enter "<accountName>" in the account name field
    And I click the "Save" button

    Examples: 
      | accountName |
      | Waqas       |

  @smoketest
  Scenario: Verify active drop down field is present
    And I visit my application
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I click the "Accounts" tab
    And I click the "New" button
  #And I enter "Waqas" in the account name field
  #And I enter "123" in the account number field
  #And I enter "www.codegator.us" in the account site field
  #And I select "Yes" for the "Active" dropdown field
  #And I select "Web" for the "Account Source" dropdown field
  #And I click the "Save" button

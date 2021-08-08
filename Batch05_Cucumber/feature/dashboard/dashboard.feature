Feature: Verify links on the dashboard
  As a valid user, I should be able to see all the menu links on the dashboar

  Scenario: Verify links on the dashboard
    #Given I open chrome browser
    And I visit my application
    And I enter "test.user@gmail.com.test" as username
    And I enter "Welcome2" as password
    When I click the login button
    Then I should see the dashboard page
    And I should see the Accounts link
    And I should see the Home link
    And I should see the Opportunity link
    #And I close the browser

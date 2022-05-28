Feature: Login features


 @signin
  Scenario: Positive login

    Given I am on the homepage
    When I enter the valid credentials
    Then I should be able to login


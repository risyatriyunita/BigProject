@SignIn
Feature: Log In
  User want to login and select the team on cicle website

  @PositiveCase @Login
  Scenario: User sign in and select the team into cicle
    Given User login with existing account
    When User navigate to dashboard page
    And User select the team
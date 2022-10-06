@CheckIn
Feature: Check In
  User want to create a check in
  Background: User sign in and select the team into cicle
    Given User login with existing account
    When User navigate to dashboard page
    And User select the team

  @PositiveCase @PublicCreateNewCheckIn
  Scenario: User create a public check in
    Given User navigate to overview page
    When User can click check in feature
    And User can click button create check in
    And User can type the question on text field
    And User can click button notified
    And User can select button select all
    And User can select button start collecting answers
    Then User success create a public check in

  @NegativeCase @PublicCreateNewCheckIn
  Scenario: User failed create a check in
    Given User navigate to overview page
    When User can click check in feature
    And User can click button create check in
    And User can select button start collecting answers
    Then User failed create a public check in

  @PositiveCase @PrivateCreateNewCheckIn
  Scenario: User create a private check in
    Given User navigate to overview page
    When User can click check in feature
    And User can click button create check in
    And User can type the question on text field
    And User can click button notified
    And User can select button select all
    And User can select button private
    And User can select button start collecting answers
    Then User success create a private check in

  @PositiveCase @CancelCreateNewCheckIn
  Scenario: User cancel create a public check in
    Given User navigate to overview page
    When User can click check in feature
    And User can click button create check in
    And User can click button cancel
    Then User success cancel create a public check in



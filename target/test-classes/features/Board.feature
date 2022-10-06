@Board
Feature: Board
  User want to create new list on board
  Background: User sign in and select the team into cicle
    Given User login with existing account
    When User navigate to dashboard page
    And User select the team

  @PositiveCase @CreateNewList
  Scenario: User create new list on board
    Given User navigate to overview page
    When User can click board feature
    And User can click button add list
    And User can input list name
    And User can click button create
    Then User success create new list on board

  @PositiveCase @CancelCreateNewList
  Scenario: User cancel create new list on board
    Given User navigate to overview page
    When User can click board feature
    And User can click button add list
    And User can click button X
    Then User success cancel create new list on board

  @NegativeCase @CreateNewList
  Scenario: User failed create new list on board
    Given User navigate to overview page
    When User can click board feature
    And User can click button add list
    And User can click button create
    Then User failed create new list on board

  @PositiveCase @CreatePublicCard
  Scenario: User create new public card on board
    Given User navigate to overview page
    When User can click board feature
    And User can click button add card
    And User can input card name
    And User can click button add card 2
    Then User success create public card

  @NegativeCase @CreatePublicCard
  Scenario: User failed create new public card on board
    Given User navigate to overview page
    When User can click board feature
    And User can click button add card
    And User can click button add card 2
    Then User failed create public card
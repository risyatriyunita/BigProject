@GroupChat
Feature: Group Chat
  User want to send message
  Background: User sign in and select the team into cicle
    Given User login with existing account
    When User navigate to dashboard page
    And User select the team

  @PositiveCase @SendMessage
  Scenario Outline: User send message
    Given User navigate to overview page
    When User can click group chat feature
    And User can type the message on text field "<text>"
    And User can click button send
    Then User success send message
    Examples:
      | text                       |
      | Halo!!!                    |
      | Nama Saya Risya Tri Yunita |
      | Sekolah QA batch 14        |
      | Salam kenal semuanya       |

  @PositiveCase @DeleteMessage
  Scenario: User delete message
    Given User navigate to overview page
    When User can click group chat feature
    And User can click button delete
    Then User success delete message

  @PositiveCase @AttachFile
  Scenario: User attach a file
    Given User navigate to overview page
    When User can click group chat feature
    And User can click button attach file
    Then User success attach a file

  @NegativeCase @AttachFile
  Scenario: User failed attach a file
    Given User navigate to overview page
    When User can click group chat feature
    And User can click button attach file 2
    Then User failed attach a file


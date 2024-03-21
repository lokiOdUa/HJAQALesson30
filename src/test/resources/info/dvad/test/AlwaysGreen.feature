@BrowserTest
Feature: Always Green

  Scenario: Always green single
    Given an example scenario
#    And update nam of the user with id "5"
#    And getting name of the user with id "5"
#    And preparing name of the user with id "5"
    When all step definitions are implemented
    Then the scenario passes

  Scenario: Always green single
    Given an example scenario
#    And update nam of the user with id "5"
#    And getting name of the user with id "5"
#    And preparing name of the user with id "5"
    When all step definitions are implemented
    Then the scenario passes

  Scenario Outline: Always green outline
    Given an example scenario run "<run>"
    When all step definitions are implemented
    Then the scenario passes
    Examples:
      | run |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |

Feature: Sometimes Green

  Scenario: Sometimes green single
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes
    And should fail sometimes

  Scenario Outline: Sometimes green outline
    Given an example scenario run "<run>"
    When all step definitions are implemented
    Then the scenario passes
    And should fail sometimes
    Examples:
     | run |
     | 1   |
     | 2   |
     | 3   |
     | 4   |
     | 5   |

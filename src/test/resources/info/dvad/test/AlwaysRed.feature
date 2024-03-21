Feature: Always Red

  Scenario: Never green single
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes
    And should fail always

  @BrowserTest
  Scenario Outline: Never green outline
    Given an example scenario run "<run>"
    When all step definitions are implemented
    Then the scenario passes
    And should fail always
    Examples:
      | run |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |

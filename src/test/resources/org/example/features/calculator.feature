Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Scenario: Add two numbers 2 & 3
    Given I have two calculators
    When I add 2 and 3 using my calculator
    And I add 2 and 3 using other calculator
    Then the result of my calculator should be 5
    And the result of other calculator should be 5
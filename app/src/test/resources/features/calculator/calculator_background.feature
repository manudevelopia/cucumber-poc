Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Background:
    Given I have a calculator

  Scenario: Add two numbers -2 & 3
    When I add -2 and 3
    Then the result should be 1

  Scenario: Add two numbers 10 & 15
    When I add 10 and 15
    Then the result should be 25

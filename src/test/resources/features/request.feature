Feature: Request
  As a user
  I want to make a get request

  Background:
    Given url calculator

  Scenario: Add two numbers -2 & 3
    When method get
    Then status

  Scenario: Add two numbers 10 & 15
    When method get
    Then status 1

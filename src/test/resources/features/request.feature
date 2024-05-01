Feature: Request
  As a user
  I want to make a get request

  Background:
    Given url https://jsonplaceholder.typicode.com

  Scenario: Get all users
    Given path /users
    When method get
    Then status 200

  Scenario: Get user 1
    Given path /users/1
    When method get
    Then status 200
    And response id 1

  Scenario Outline: Get user 1,2,3
    Given path /users/<USER_ID>
    When method get
    Then status 200
    Examples:
      | USER_ID |
      | 1       |
      | 2       |
      | 3       |

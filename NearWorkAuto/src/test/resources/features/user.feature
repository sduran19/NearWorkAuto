@Regression1
Feature: as a user I want an Api's) to create and authenticate

  @CreateUser
  Scenario: create user on the platform
    Given someone needs to consume the api
    When he creates a user
      | email            | password | name   | lastName | documentType | documentNumber | cellPhone | address         | role    |
      | test@yopmail.com | 123456   | Junito | Becerra  | CEDULA       | 102030         | 2770010   | Calle falsa 123 | usuario |
    Then he should get the status code 200
    And he should get the response with the data requested

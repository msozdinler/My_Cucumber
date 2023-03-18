Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

    Scenario Outline: Create a Citizenship
    Given Navigate to Citizenship page
      Then Click on add button
      Then Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
      When Click on save button
      Then Success message should be displayed


      Examples:
      |CitizenshipName |CitizenshipShortName|
      |Mert1                |mr1              |
      |Mert2                |mr2              |
      |Mert3                |mr3              |
      |Mert4                |mr4              |

  Scenario Outline: Delete Citizenship
    And Search for Citizenship with name as "<CitizenshipName>" nad short name as "<CitizenshipShortName>"
    And Delete citizenship
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | Mert1            | mr1                  |
      | Mert2            | mr2                  |
      | Mert3            | mr3                  |
      | Mert4            | mr4                  |
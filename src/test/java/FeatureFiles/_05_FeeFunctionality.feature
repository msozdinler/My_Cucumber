Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Create A Fee
    Given Navigate to Fee Page
    And Click on add button
    And Fill the add fee form
    |Ricardo|
    |Q7|
    |rq|
    |7|
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete Fee
    Given Search for the Fee
      | Ricardo |
      | Q7          |
      | 7         |
    When Delete Fee
    Then Success message should be displayed

Feature: Data Table Example

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | John           |
      | Snow           |
      | 35 Main Avenue |
      | 6476476767     |
    Then Save the form

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | John           |
      | Snow           |
      | 35 Main Avenue |
      | 6476476767     |
    And Enter Valid Information
    |Name|John|
    |Last Name|Snow|
    |Address|35 Main Avenue|
    |Phone|6476476767  |
    Then Save the form

    #  Scenario outline runs the entire scenario for each set of data
    #  Data table sends the entire data to only one step at the same time
    #  and runs the scenario once
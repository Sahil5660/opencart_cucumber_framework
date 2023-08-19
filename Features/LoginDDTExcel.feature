Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given User launch browser
    And open URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on login
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |

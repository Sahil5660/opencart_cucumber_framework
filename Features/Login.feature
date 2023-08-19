Feature: Login with valid credentials

  @sanity
  Scenario: Successful Login with Valid Credentials
    Given User launch browser
    And open URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on login
    And User enters Email as "shlsharma323@gmail.com" and Password as "Test@123"
    And click on login button
    Then user navigate to MyAccount page
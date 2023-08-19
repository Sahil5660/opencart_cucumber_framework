Feature: Login Data Driven



  Scenario Outline: Login Data Driven

    Given User launch browser

    And open URL "http://localhost/opencart/upload/"

    When User navigate to MyAccount menu

    And click on login

    And User enters Email as "<email>" and Password as "<password>"

    And click on login button

    Then user navigate to MyAccount page



    Examples: 

      | email                     | password |

      | shlsharma323@gmail.com    | Test@123  |

      | pavanoltraining@gmail.com | test@123 |
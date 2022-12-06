Feature: Checking Password screen

  Scenario: To check positive flow
    Given Open the gmail page
    And Enter Valid Email
    And Enter Valid Password
    When Selecting Next in Password Screen
    Then Should navigate to homepage

  Scenario Outline: To check negative flow
    Given Open the gmail page
    And Enter Valid Email
    And From password screen enter invalid password "<invalid password>"
    When Selecting Next in Password Screen
    Then Should navigate to homepage

    Examples: 
      | invalid password |
      |           123456 |
      | qwerty           |

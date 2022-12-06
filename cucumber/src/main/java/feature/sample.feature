Feature: Open Gmail Page and signin



  Scenario: Positive Flow
    Given Open the gmail page
    And Enter Valid Email
    When Select Next in Email Screen
    Then The password screen will be displayed

  Scenario Outline: Negative Flow
    Given Open the gmail page
    And Enter invalid email "<invalid email>"
    When Select Next in Email Screen
    Then Error message should be displayed

    Examples: 
      | invalid email |
      |        1234567890 |
      | 9876543210       |

Feature: Scenario Outline Example

  @newUser
  Scenario Outline: 
    When user enters login info "<username>" and "<password>"
    And I click on login button
    Then Welcome "<firstname>" message is displayed

    Examples: 
      | username        | password    | firstname |
      | FranceParis     | Paris@2023  | Paris     |
      | TurkiyeAnkara   | Ankara@2023 | Ankara    |
      | LizbonPortuqual | Lizbon@2023 | Portuqual |

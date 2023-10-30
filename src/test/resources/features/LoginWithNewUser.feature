Feature: Scenarios with new Users DataTable

  @data
  Scenario: Add new Users with DataTable
    When user enters username and password and clicks on login
      | username        | password    | firstname |
      | FranceParis     | Paris@2023  | Paris     |
      | TurkiyeAnkara   | Ankara@2023 | Ankara    |
      | LizbonPortuqual | Lizbon@2023 | Portuqual |
   
    Then log out

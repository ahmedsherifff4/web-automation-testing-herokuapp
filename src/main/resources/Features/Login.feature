Feature: Login Functionality
  Scenario: Verify that user will redirect to secure area page when enter valid credentials
    Given user is on Login Page
    When user enter valid credentials
    And click on login button
    Then user should be redirected to secure are page


    Scenario: Verify That user will redirected to secure area page when enter valid credentials
      Given user is on Login Page
      When user enter "tomsmith" and "SuperSecretPassword!"
      And click on login button
      Then user should be redirected to secure are page

      Scenario Outline: Verify Login Eith Different Credentials
        Given user is on Login Page
        When user enter "<username>" and "<password>"
        And click on login button
        Then Validate Message According To "<Input>"
        Examples:
        |username   |password   |Input   |
        | tomsmith  | SuperSecretPassword!|valid |
        | tomsmith   |     invalid                |invalid      |
        |       invalid |  SuperSecretPassword!    |invalid     |
        |       |          |invalidtheboth |
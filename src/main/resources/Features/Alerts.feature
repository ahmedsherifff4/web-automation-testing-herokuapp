Feature: Alerts Functinality
  Scenario: Verify That User Click On Js Alert
    Given User Click On Alerts Pages
     Then User Redirect ti Alerts Page
    Given User Click On ID Alerts
    When UAer should see Alert message
    Then User Should See Result Text
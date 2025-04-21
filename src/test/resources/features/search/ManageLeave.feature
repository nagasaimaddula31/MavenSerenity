Feature: Leave Management in CRM Application

  Scenario: Apply leave with valid details

    Given Admin is on the Leave tab
    When Admin clicks the Apply tab
    And Admin checks for the confirmation message
    And Admin selects the following details:
      | Leave Type     | From Date   | To Date     | Comments          |
      | CAN - Personal | 2025-04-12  | 2025-04-23  | Vacation to Europe |
    And Admin clicks the Apply button
    Then Admin should be able to verify the leave

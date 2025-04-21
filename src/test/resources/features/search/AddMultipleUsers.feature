@regression
Feature: Users Management in CRM Application

Scenario: Create new user with valid details
  
  When Admin clicks Add button
  And Admin selects the following multiple user details:
    | User Role | Employee Name         | Status  | Username           | Password   | Confirm Password |
    | ESS       | Timothy Lewis Amiano  | Enabled | TimothyLewisAmiano | abc567sccs | abc567sccs       |
    | Admin     | Joker John Selvam     | Enabled | JohnAdmin          | admin123   | admin123         |
  Then Admin should be able to create a new user

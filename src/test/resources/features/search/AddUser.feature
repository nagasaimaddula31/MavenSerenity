@smoke
Feature: User Management in CRM Application

Scenario: Create new user with valid details

When Admin clicks Add button
And Admin selects the following user details:
  | User Role | Employee Name | Status  | Username        | Password | Confirm Password |
  | ESS       | Timothy Lewis Amiano | Enabled |TimothyLewisAmiano| abc567sccs   | abc567sccs           |
And Admin clicks save button 
Then Admin should be able to create a new user
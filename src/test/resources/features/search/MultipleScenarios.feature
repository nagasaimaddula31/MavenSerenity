Feature: Login to CRM Application

Scenario: Create new user with valid details

When Admin clicks Add button
And Admin selects the following user details:
  | User Role | Employee Name | Status  | Username        | Password | Confirm Password |
  | ESS       | Timothy Lewis Amiano | Enabled |TimothyLewisAmiano| abc567sccs   | abc567sccs           |
And Admin clicks save button 
Then Admin should be able to create a new user

@smoke
 Scenario: Create new Job with valid details

    When Admin clicks Jobs Tab and selects Job Titles
    And Admin enters the following job details in add page :
      | Job Title    | Job Description        | Note                                               |
      | AQA Engineer timestamp  | QA Engineer testing    | QA Engineer does both manual and automation testing |
    Then Admin should be able to create a new job

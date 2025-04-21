@smoke
Feature: Job Management in CRM Application

  Scenario: Create new Job with valid details

    When Admin clicks Jobs Tab and selects Job Titles
    And Admin enters the following job details in add page :
      | Job Title    | Job Description        | Note                                               |
      | AQA Engineer timestamp  | QA Engineer testing    | QA Engineer does both manual and automation testing |
    Then Admin should be able to create a new job
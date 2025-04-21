@regression
Feature: Job Management in CRM Application

  Scenario Outline: Create new Job with dynamic job details
    
    When Admin clicks Jobs Tab and selects Job Titles
    And Admin enters the following job details in add page :
      | Job Title           | Job Description        | Note                                               |
      | AQA Engineer <timestamps> | QA Engineer testing    | QA Engineer does both manual and automation testing |
    Then Admin should be able to create a new job
    

    Examples:
      | timestamps           |
      | timestamp1         |
      | timestamp2         |
      | timestamp3         |
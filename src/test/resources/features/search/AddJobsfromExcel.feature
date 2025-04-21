
Feature: Job Management in CRM Application excel

  Scenario: Create new Jobs with valid details

    When Admin clicks Jobs Tab and selects Job Titles
    And Admin adds multiple jobs from Excel
    Then Admin should be able to create a new job
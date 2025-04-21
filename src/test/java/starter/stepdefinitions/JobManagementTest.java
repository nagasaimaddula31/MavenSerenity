package starter.stepdefinitions;

import java.util.List;
import java.util.Map;

import Steps.HomePageSteps;
import Steps.JobManagementSteps;
import Utils.ExcelReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class JobManagementTest {

	
	@Steps
	JobManagementSteps jobSteps;
	
	@Steps
	HomePageSteps homepageSteps;
	
	@When("Admin clicks Jobs Tab and selects Job Titles")
	public void admin_clicks_jobs_tab_and_selects_job_titles() {
	   
		jobSteps.navigateToJobTitles();
	}

	@When("Admin enters the following job details in add page :")
	public void admin_enters_the_following_job_details_in_add_page(DataTable jobData) {
	   
		jobSteps.enterJobDetails(jobData);
	}
	
	@When("Admin adds multiple jobs from Excel")
	public void admin_adds_multiple_jobs_from_excel() {
	    
		List<Map<String, String>> jobData = ExcelReader.getExcelData("src/test/resources/UserDetails.xlsx", "Sheet1");

	    for (Map<String, String> row : jobData) {
	        String jobTitle = row.get("Job Title");
	        String jobDescription = row.get("Job Description");
	        String note = row.get("Note");

	        jobSteps.enterJobDetails(jobTitle, jobDescription, note);
	    }
	}

	@Then("Admin should be able to create a new job")
	public void admin_should_be_able_to_create_a_new_job() {
	   
		jobSteps.verifyJobCreation();
	}
	
	@Then("Admin logs out from the application")
	public void admin_logs_out_from_the_application() {
	    
		homepageSteps.logout();
	}
}

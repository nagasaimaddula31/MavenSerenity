package Steps;

import java.util.List;
import java.util.Map;

import Pages.Homepage;
import Pages.JobTitlesPage;
import Pages.LoginPage;
import Utils.TimestampUtil;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;

public class JobManagementSteps {
	
	LoginPage loginPage;
	Homepage homepage;
    JobTitlesPage jobTitlesPage;
    
    @Step
    public void openHomePage() {
    	loginPage.openApplication();
    	loginPage.enterUserName();
    	loginPage.enterPassword();
    }

    @Step
	public void navigateToJobTitles() {
		
		homepage.clickAdminTab();
		homepage.navigateToJobTitles();
	}

    @Step
	public void enterJobDetails(DataTable jobData) {

		List<Map<String, String>> data = jobData.asMaps(String.class, String.class);
        Map<String, String> job = data.get(0);
      
        jobTitlesPage.clickAddButton();
        jobTitlesPage.fillJobDetails(job.get("Job Title") , job.get("Job Description"), job.get("Note"));
        jobTitlesPage.clickSave();
	}

    @Step
	public void verifyJobCreation() {

		jobTitlesPage.verifyJobCreated("AQA Engineer timestamp");
	}

    @Step
	public void enterJobDetails(String jobTitle, String jobDescription, String note) {

    	 jobTitlesPage.clickAddButton();
         jobTitlesPage.fillJobDetails(jobTitle,jobDescription,note);
         jobTitlesPage.clickSave();
		
	}

	

}

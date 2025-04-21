package starter.stepdefinitions;

import java.util.List;
import java.util.Map;

import Steps.LeaveSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class ManageLeaveTest {

	 @Steps
	    LeaveSteps leaveSteps;

	    @Given("Admin is on the Leave tab")
	    public void admin_is_on_leave_tab() {
	        leaveSteps.navigateToLeaveTab();
	    }

	    @When("Admin clicks the Apply tab")
	    public void admin_clicks_apply_tab() {
	        leaveSteps.clickApplyTab();
	    }

	    @And("Admin checks for the confirmation message")
	    public void admin_checks_for_confirmation_message() {
	        if (leaveSteps.isConfirmationMessageVisible()) {
	            System.out.println("No Leave Types with Leave Balance Message displayed. Leave not applied.");
	            throw new RuntimeException("Leave application canceled due to No Leave Types with Leave Balance");
	        }
	    }
	    
	    @And("Admin selects the following details:")
	    public void admin_selects_the_following_details(DataTable dataTable) {
	        List<Map<String, String>> leaveDetails = dataTable.asMaps(String.class, String.class);
	        Map<String, String> row = leaveDetails.get(0); // Assuming only one row

	        String leaveType = row.get("Leave Type");
	        String fromDate = row.get("From Date");
	        String toDate = row.get("To Date");
	        String comments = row.get("Comments");

	        leaveSteps.enterLeaveDetails(leaveType, fromDate, toDate, comments);
	    }

	    @And("Admin clicks the Apply button")
	    public void admin_clicks_apply_button() {
	        leaveSteps.clickApplyButton();
	    }

	    @Then("Admin should be able to verify the leave")
	    public void admin_should_verify_leave() {
	        leaveSteps.verifyLeaveApplied();
	    }
}

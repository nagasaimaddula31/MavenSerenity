package starter.stepdefinitions;

import java.util.List;
import java.util.Map;

import Steps.AddNewUserSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class AddUserTest {

		@Steps
	    AddNewUserSteps addNewUserSteps;

	    @Given("Admin is on home page")
	    public void admin_is_on_home_page() {
	    	addNewUserSteps.openHomePage();
	    }

	    @When("Admin clicks Add button")
	    public void admin_clicks_add_button() {
	    	addNewUserSteps.clickAddButton();
	    }

	    @When("Admin selects the following user details:")
	    public void admin_selects_user_details(DataTable dataTable) {
	        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

	        String userRole = data.get(0).get("User Role");
	        String employeeName = data.get(0).get("Employee Name");
	        String status = data.get(0).get("Status");
	        String username = data.get(0).get("Username");
	        String password = data.get(0).get("Password");
	        String confirmPassword = data.get(0).get("Confirm Password");

	        addNewUserSteps.selectUserDetails(userRole, employeeName, status, username, password, confirmPassword);
	    }

	    @When("Admin clicks save button")
	    public void admin_clicks_save_button() {
	    	addNewUserSteps.clickSaveButton();
	    }

	    @Then("Admin should be able to create a new user")
	    public void admin_should_be_able_to_create_a_new_user() {
	    	addNewUserSteps.verifyUserCreation();
	    }
	}



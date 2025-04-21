package starter.stepdefinitions;

import java.util.List;
import java.util.Map;

import Steps.AddNewMultipleUsersSteps;
import Steps.AddNewUserSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class AddMultipleUsersTest {

		@Steps
		AddNewMultipleUsersSteps addNewMultipleUserSteps;

		
	    @When("Admin selects the following multiple user details:")
	    public void admin_selects_multiple_user_details(DataTable dataTable) {
	        

	    	addNewMultipleUserSteps.selectMultipleUserDetails(dataTable);
	    }

	   
	}



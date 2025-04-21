package Steps;

import java.util.List;
import java.util.Map;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.UserManagementPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;

public class AddNewMultipleUsersSteps {

	LoginPage loginPage;
	UserManagementPage userManagementPage;

	@Step("open home page")
	public void openHomePage() {
	    loginPage.openApplication();
		loginPage.enterUserName();
		loginPage.enterPassword();
	}


	
	 @Step("select Multiple User details")
		
	 public void selectMultipleUserDetails(DataTable dataTable) {

		 // Convert DataTable to a List of Maps where each Map represents one row of data
		    List<Map<String, String>> userDataList = dataTable.asMaps(String.class, String.class);

		    // Iterate through each user's data
		    for (Map<String, String> userData : userDataList) {
		        // Extract individual fields for each user
		        String userRole = userData.get("User Role");
		        String employeeName = userData.get("Employee Name");
		        String status = userData.get("Status");
		        String username = userData.get("Username");
		        String password = userData.get("Password");
		        String confirmPassword = userData.get("Confirm Password");
		        
		       
		        userManagementPage.selectUserRole(userRole);
				 userManagementPage.enterEmployeeName(employeeName);
				 userManagementPage.selectStatus(status);
				 userManagementPage.enterUsername(username);
				 userManagementPage.enterPassword(confirmPassword);
				 userManagementPage.enterConfirmPassword(confirmPassword);
				 userManagementPage.clickSaveButton();
				 userManagementPage.clickAddButton();
		    }
		 
		}

	

	
}

package Steps;

import Pages.LoginPage;
import Pages.UserManagementPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;

public class AddNewUserSteps {

	LoginPage loginPage;
	UserManagementPage userManagementPage;

	@Step("open home page")
	public void openHomePage() {
	    loginPage.openApplication();
		loginPage.enterUserName();
		loginPage.enterPassword();
	}

	 @Step("click Add button")
	public void clickAddButton() {
		
		 userManagementPage.clickAddButton();
	}

	 @Step("select User details")
	public void selectUserDetails(String userRole, String employeeName, String status, String username, String password,
			String confirmPassword) {

		 userManagementPage.selectUserRole(userRole);
		 userManagementPage.enterEmployeeName(employeeName);
		 userManagementPage.selectStatus(status);
		 userManagementPage.enterUsername(username);
		 userManagementPage.enterPassword(confirmPassword);
		 userManagementPage.enterConfirmPassword(confirmPassword);
		 
	}

	 @Step("click save button")
	public void clickSaveButton() {

		 userManagementPage.clickSaveButton();
	}

	public void verifyUserCreation() {
		// TODO Auto-generated method stub
		
	}

	

	
	
	

}

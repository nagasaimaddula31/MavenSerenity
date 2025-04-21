package Steps;

import Pages.LeavePage;
import net.serenitybdd.annotations.Step;

public class LeaveSteps {

	LeavePage leavePage;
	
	@Step
	public void navigateToLeaveTab() {
		
		leavePage.clickLeaveTab();
	}

	@Step
	public void clickApplyTab() {
		
		leavePage.clickApplyTab();
	}

	@Step
	public boolean isConfirmationMessageVisible() {
	
		return leavePage.isConfirmationMessageVisible();
	}
	@Step
	public void enterLeaveDetails(String leaveType, String fromDate, String toDate, String comments) {
		
		leavePage.selectLeaveType(leaveType);
     
        leavePage.enterToDate(toDate);
        leavePage.enterFromDate(fromDate);
        leavePage.enterComments(comments);
	}


	@Step
	public void clickApplyButton() {
		
		leavePage.clickApplyButton();
	}
	
	@Step
	public void verifyLeaveApplied() {
		
        leavePage.verifyLeaveIsVisible();

	}

	

}

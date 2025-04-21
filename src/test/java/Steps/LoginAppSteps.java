package Steps;

import Pages.Homepage;
import Pages.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginAppSteps {
	
	LoginPage loginPage;
	Homepage homepage;


	@Step("launch application")
	public void openApplication() {

		loginPage.openApplication();
	}

	@Step("enter userName")
	public void enterUserName() {
		
		
		loginPage.enterUserName();
	}

	@Step("enter Password")
	
	public void enterPassword() {
		
		loginPage.enterPassword();
	}
	
	
	@Step("verifying homepage")
	public void verifyHomepage() {
		
		
		homepage.verifyHomepage();
	}
}

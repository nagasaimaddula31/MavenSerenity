package starter.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.LoginPage;
import Steps.LoginAppSteps;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;

public class LoginAppTest {
	
	@Steps
	LoginAppSteps loginSteps;
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
		loginSteps.openApplication();
	}

	@When("user enters Admin as username")
	public void user_enters_admin_as_username() {
		loginSteps.enterUserName();
	}
	
	@When("user enters admin123 as password")
	public void user_enters_admin123_as_password() {
		loginSteps.enterPassword();
	}
	
	@Then("user should see dashboard")
	public void user_should_see_dashboard() {
		loginSteps.verifyHomepage();
	}
	
	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
		
		loginSteps.enterUserName();
	}

	@When("user enter admin123 as password")
	public void user_enter_admin123_as_password() {
		loginSteps.enterPassword();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		loginSteps.verifyHomepage();
	}

	
	

}
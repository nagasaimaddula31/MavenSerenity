package starter.stepdefinitions;

import Steps.HomePageSteps;
import Steps.LoginAppSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class Hooks {

	 @Steps
	    LoginAppSteps loginSteps;
	 @Steps
	    HomePageSteps homepageSteps;

	    @Before
	    public void beforeScenario() {
	        loginSteps.openApplication(); 
	        loginSteps.enterUserName();
	        loginSteps.enterPassword();
}
	    
	    @After
	    public void afterScenario() {
	        homepageSteps.logout();
	    }
}

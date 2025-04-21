package Pages;

import org.openqa.selenium.By;

import Utils.loggerUtil;
import io.cucumber.core.logging.Logger;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	
	
	private By userName =By.name("username");
	private By userPassword =By.name("password");
	
	public void openApplication()
	
	{
		open();
		getDriver().manage().window().maximize();
		
		
	}
	
	
	public void enterUserName()
	{
		shouldBeVisible(userName);
		$(userName).type("Admin");

	}
	
	public void enterPassword()
	{
		$(userPassword).typeAndEnter("admin123");

	}
	
	

}

package Pages;

import org.openqa.selenium.By;

import Utils.TimestampUtil;
import net.serenitybdd.core.pages.PageObject;

public class JobTitlesPage extends PageObject{
	
	
	
	By addButton = By.xpath("//button[normalize-space()='Add']");
    By jobTitleField = By.xpath("//label[normalize-space()='Job Title']/following::input");
    By jobDescriptionField = By.xpath("//textarea[@placeholder='Type description here']");
    By noteField = By.cssSelector("textarea[placeholder='Add note']");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    String timeStamp=TimestampUtil.getCurrentTimestamp();
    public void clickAddButton() {
        $(addButton).click();
    }

    public void fillJobDetails(String title, String description, String note) {
        $(jobTitleField).type(title.replace("timestamp",timeStamp));
        $(jobDescriptionField).type(description);
        $(noteField).type(note);
    }

    public void clickSave() {
        $(saveButton).click();
    }

    public void verifyJobCreated(String jobTitle) {

    	String jobtitle=jobTitle.replace("timestamp",timeStamp);
    	By jobLocator = By.xpath("//div[contains(text(),'" + jobtitle + "')]");

    	 $(jobLocator).waitUntilVisible().shouldBeVisible();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class LeavePage extends PageObject {

    // By Locators
    private final By leaveTab = By.xpath("//span[normalize-space()='Leave']");
    private final By applyTab = By.xpath("//a[normalize-space()='Apply']");
    private final By leaveTypeDropdownIcon = By.xpath("//label[normalize-space()='Leave Type']/following::div[normalize-space()='-- Select --']");
    private final By leaveTypeDropdown =By.xpath("//span[contains(text(),'CAN - Personal')]");
    private final By fromDateInput = By.xpath("//label[normalize-space()='From Date']/following::input");
    private final By toDateInput = By.xpath("//label[normalize-space()='To Date']/following::input");
    private final By commentsInput = By.xpath("//label[normalize-space()='Comments']/following::textarea");
    private final By applyButton = By.xpath("//button[normalize-space()='Apply']");
    private final By confirmationMessage = By.cssSelector(".Success"); 
    private final By preConfirmationMessage = By.xpath("//p[text()='No Leave Types with Leave Balance']");

  
    
    // Actions

    public void clickLeaveTab() {
        getDriver().findElement(leaveTab).click();
    }

    public void clickApplyTab() {
        getDriver().findElement(applyTab).click();
    }

    public void selectLeaveType(String type) {
         getDriver().findElement(leaveTypeDropdownIcon).click();
         getDriver().findElement(leaveTypeDropdown).click();
        
        
    }

    public void enterFromDate(String date) {
        WebElement fromInput = getDriver().findElement(fromDateInput);
        fromInput.clear();
        fromInput.sendKeys(date);
    }

    public void enterToDate(String date) {
        WebElement toInput = getDriver().findElement(toDateInput);
        
        toInput.sendKeys(date);
    }

    public void enterComments(String comment) {
        getDriver().findElement(commentsInput).sendKeys(comment);
    }

    public void clickApplyButton() {
        getDriver().findElement(applyButton).click();
    }

    public void verifyLeaveIsVisible() {
        // Example: wait for confirmation or assert it's visible
        WebElement confirmation = getDriver().findElement(confirmationMessage);
        assert confirmation.isDisplayed();
    }

	public boolean isConfirmationMessageVisible() {

		try {
            WebElement message = getDriver().findElement(preConfirmationMessage);
            return message.isDisplayed();
        } catch (Exception e) {
            return false;
        }
	}
}

	


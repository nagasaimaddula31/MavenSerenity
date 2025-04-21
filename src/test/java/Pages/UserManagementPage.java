package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utils.nameUtil;
import net.serenitybdd.core.pages.PageObject;

public class UserManagementPage extends PageObject {

	private By AdminButton=By.xpath("//span[normalize-space()='Admin']");
	private By addButton = By.xpath("//button[normalize-space()='Add']");
    private By userRoleDropdown = By.xpath("//label[normalize-space()='User Role']/following::div[contains(text(),'-- Select --')]");
    private By userRoleSelect=By.xpath("//span[contains(text(),'ESS')]");
    private By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");
    private By statusDropdown = By.xpath("//label[normalize-space()='Status']/following::div[contains(text(),'-- Select --')]");
    private By statusSelect=By.xpath("//span[contains(text(),'Enabled')]");
    private By usernameInput = By.xpath("//label[normalize-space()='Username']/following::input");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By confirmPasswordInput = By.xpath("(//input[@type='password'])[2]");
    private By saveButton = By.xpath("//button[normalize-space()='Save']");
    private By cancelButton = By.xpath("//button[normalize-space()='Cancel']");

    
 
    public void clickAddButton() {
    	$(AdminButton).click();
        $(addButton).click();
    }

    public void selectUserRole(String userRole) {
        $(userRoleDropdown).click();
        $(userRoleSelect).click();
        //setTimeout(() => { debugger; }, 3000)

  
    }

    public void enterEmployeeName(String employeeName) {
    	String keyCombo = Keys.chord(Keys.DOWN, Keys.ENTER);

        $(employeeNameInput).sendKeys(employeeName);
        waitABit(5000);
        $(employeeNameInput).sendKeys(keyCombo);
        
    }

    public void selectStatus(String status) {
        $(statusDropdown).click();
        $(statusSelect).click();
    }

    public void enterUsername(String username) {
    	
        $(usernameInput).type(username+nameUtil.getName());
    }

    public void enterPassword(String password) {
        $(passwordInput).type(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        $(confirmPasswordInput).type(confirmPassword);
    }

    public void clickSaveButton() {
        $(saveButton).click();
        waitABit(10000);

    }
    
    public void clickCancelButton() {
        $(cancelButton).click();
        waitABit(10000);

    }

    
}

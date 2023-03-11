package Pages;

import Utilities.BasicDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }
}
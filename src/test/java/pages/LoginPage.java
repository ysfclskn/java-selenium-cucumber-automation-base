package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.PageHelper;

public class LoginPage extends PageHelper {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartButton;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "user-name")
    WebElement usernameInput;

    public void loginWithRegisteredUser(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void verifyLoggedIn() {
        verifyElementVisible(shoppingCartButton);
    }
}

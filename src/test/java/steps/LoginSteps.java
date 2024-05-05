package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("login with {string} username and {string} password on login page")
    public void loginWithUsernameAndPasswordOnLoginPage(String username, String password) throws InterruptedException {
        loginPage.loginWithRegisteredUser(username, password);
    }

    @Then("verify user logged in")
    public void verifyUserLoggedIn() {
        loginPage.verifyLoggedIn();
    }

}

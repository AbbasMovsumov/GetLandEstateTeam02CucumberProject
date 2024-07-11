package getLandEstate.stepDefinitons;

import getLandEstate.pages.LoginPage;
import getLandEstate.pages.Pages;
import io.cucumber.java.en.Given;

public class Test {
    Pages pages = new Pages();
    @Given("user login as {string}")
    public void user_login_as(String role) {
        pages.loginPage().loginWithRole("Admin");

    }
}

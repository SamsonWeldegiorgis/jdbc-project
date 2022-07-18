package com.cydeo.step_definitions;

import com.cydeo.page.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given(": The user is on the login")
    public void the_user_is_on_the_login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }
    @When(": User login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("libraryUsername1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("libraryPassword1"));
        loginPage.signBtn.click();

    }
    @Then(": Dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        String expectedUrl = "dashboard";
        wait.until(ExpectedConditions.urlContains(expectedUrl));
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue("dashboard is not appeared on URL" , actualUrl.contains(expectedUrl));

    }
    /////////////////////////////////////////////////////////

    @When(": User login as a student")
    public void user_login_as_a_student() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("studentUser"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("studentPass"));
        loginPage.signBtn.click();

    }
    @Then(": Books should be displayed")
    public void books_should_be_displayed() {

        String expectedUrl = "books";
        wait.until(ExpectedConditions.urlContains(expectedUrl));
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue("Books is not appeared on URL" , actualUrl.contains(expectedUrl));


    }
}

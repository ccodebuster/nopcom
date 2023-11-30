package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        Assert.assertEquals("Error message not displayed", errorMessage, new LoginPage().getErrorMessage());
    }

    @When("^I am on homepage I see login link$")
    public void iAmOnHomepageISeeLoginLink() {
        String actualText=new HomePage().verifyLoginLink();
        String expectedText= "Log in";
        Assert.assertEquals(actualText,expectedText);
    }

    @When("^I am login page$")
    public void i_am_login_page() {

    }
}

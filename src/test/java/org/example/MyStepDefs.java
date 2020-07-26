package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationConfirmPage registrationConfirmPage = new RegistrationConfirmPage();


    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homepage.CheckForHomepage();
    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homepage.clickOnRegisterLink();
    }

    @When("^user enter all required required details$")
    public void user_enter_all_required_required_details() throws Throwable {
        registerPage.checkRegistrationPage();
        registerPage.enterRegisterPageDetais();

    }

    @When("^user clicks on register-submit button$")
    public void user_clicks_on_register_submit_button() {
        registerPage.clickOnButton();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        registrationConfirmPage.registrationConfirmation();
    }




}

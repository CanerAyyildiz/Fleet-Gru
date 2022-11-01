package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.ForgotPasswordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPasswordLink_stepdefinitions {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @When("user clicks to Forgot your password? link")
    public void user_clicks_to_forgot_your_password_link() {
        forgotPasswordPage.forgotPasswordLink.click();


    }


    @Then("user should see {string} page")
    public void userShouldSeePage(String string) {
        Assert.assertTrue(forgotPasswordPage.forgotHeader.getText().equals(string));
    }
}

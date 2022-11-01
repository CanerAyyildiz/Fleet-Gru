package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class InvalidLogin_stepdefinitions {

    LoginPage loginPage = new LoginPage();

    @Then("user should see  {string}")
    public void user_should_see(String string) {
        Assert.assertTrue(loginPage.alertMessage.getText().equals(string));


    }



}

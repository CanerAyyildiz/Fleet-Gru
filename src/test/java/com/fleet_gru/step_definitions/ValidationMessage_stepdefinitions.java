package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class ValidationMessage_stepdefinitions {

    LoginPage loginPage = new LoginPage();


    @Then("user should see validation message {string}")
    public void user_should_see_validation_message(String string) {

        //String msg = loginPage.usernameInput.getAttribute("validationMessage");
        //String msg2 = loginPage.passwordInput.getAttribute("validationMessage");
       // String msg3 = loginPage.usernameInput.getAttribute("validationMessage");

        //Assert.assertEquals(msg,string);
       // Assert.assertEquals(msg2,string);
       // Assert.assertEquals(msg3,string);

        Assert.assertTrue(loginPage.usernameInput.getAttribute("validationMessage").equals(string));




    }

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String string) {
        Assert.assertTrue(loginPage.passwordInput.getAttribute("validationMessage").equals(string));

    }
}

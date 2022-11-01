package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BulletSigns_stepdefinitions {

    LoginPage loginPage = new LoginPage();
    @When(":user enters to password {string}")
    public void user_enters_to_password(String string) {
        loginPage.passwordInput.sendKeys(string);

    }
    @Then(":password should see bullet signs")
    public void password_should_see_bullet_signs() {
        Assert.assertTrue(loginPage.passwordInput.getAttribute("type").equals("password"));


    }
}

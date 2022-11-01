package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.RememberMePage;
import com.fleet_gru.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RememberMe_stepdefinitions {


    RememberMePage rememberMePage = new RememberMePage();
    @When("user should see  {string} link")
    public void userShouldSeeLink(String string) {
        Assert.assertTrue(rememberMePage.rememberText.getText().equals(string));
    }

    @When("user select Remember Me checkbox")
    public void user_select_remember_me_checkbox() {
        rememberMePage.rememberCheckbox.click();

    }
    @Then("user should see clickable")
    public void user_should_see_clickable() {
        rememberMePage.rememberCheckbox.isSelected();

    }


}

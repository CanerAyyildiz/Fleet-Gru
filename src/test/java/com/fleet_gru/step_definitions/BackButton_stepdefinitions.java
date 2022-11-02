package com.fleet_gru.step_definitions;

import com.fleet_gru.utilities.Driver;
import io.cucumber.java.en.When;

public class BackButton_stepdefinitions {

    @When("user clicks to back button")
    public void user_clicks_to_back_button() {
        Driver.getDriver().navigate().back();
    }
}

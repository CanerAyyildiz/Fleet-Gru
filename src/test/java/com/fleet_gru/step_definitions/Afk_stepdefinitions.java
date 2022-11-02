package com.fleet_gru.step_definitions;

import io.cucumber.java.en.When;

public class Afk_stepdefinitions {

    @When("user will not take action for {int} minutes")
    public void user_will_not_take_action_for_minutes(Integer int1) throws InterruptedException {

        Thread.sleep(5000);

    }

}

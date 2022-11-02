package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.LoginPage;
import com.fleet_gru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloseTab_stepDefinitons {


    LoginPage loginPage = new LoginPage();
    @When("close tab of page fleet-gru")
    public void close_tab_of_page_fleet_gru() {
        Driver.closeDriver();
    }

    @Then("user should see the login page again")
    public void userShouldSeeTheLoginPageAgain() {
        String expectedResult = "Login";
        String actualResult =Driver.getDriver().getTitle();

        Assert.assertEquals(expectedResult,actualResult);

    }
}

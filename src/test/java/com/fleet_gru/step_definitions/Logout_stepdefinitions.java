package com.fleet_gru.step_definitions;

import com.fleet_gru.pages.LoginPage;
import com.fleet_gru.pages.ProfilMenuPage;
import com.fleet_gru.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;

public class Logout_stepdefinitions {


   ProfilMenuPage profilMenuPage = new ProfilMenuPage();
   LoginPage loginPage = new LoginPage();

    @And("user clicks to login button")
    public void userClicksToLoginButton() throws InterruptedException {
        loginPage.submitButton.click();
        Thread.sleep(18000);
    }

    @And("user click to profil menü")
    public void userClickToProfilMenü() throws InterruptedException {
        try{

            profilMenuPage.selectlogout.click();
        }catch (ElementNotVisibleException e) {
            System.out.println("ElementNotVisibleException got handled successfully");
        }
        Thread.sleep(5000);

    }
    @When("user clicks to log out button")
    public void user_clicks_to_log_out_button() throws InterruptedException {
        try{

            profilMenuPage.logoutButton.click();
        }catch (ElementClickInterceptedException e) {
            System.out.println("ElementClickInterceptedException got handled successfully");
        }
      Thread.sleep(3000);




    }

    @Then("user should see login page")
    public void userShouldSeeLoginPage() {
        Assert.assertTrue(loginPage.loginPageHeader.getText().equals("Login"));


    }



}

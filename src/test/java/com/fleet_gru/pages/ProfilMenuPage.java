package com.fleet_gru.pages;

import com.fleet_gru.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilMenuPage {

    public ProfilMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a/text()")
    public WebElement profilMenu;

    @FindBy(id = "user-menu")
    public WebElement userMenu;
}

package com.fleet_gru.pages;

import com.fleet_gru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RememberMePage {

    public RememberMePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".custom-checkbox__text")
    public WebElement rememberText;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberCheckbox;
}

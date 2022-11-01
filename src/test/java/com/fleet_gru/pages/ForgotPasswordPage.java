package com.fleet_gru.pages;

import com.fleet_gru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Forgot your password?")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//h2[@class='title']")
    public  WebElement forgotHeader;


}

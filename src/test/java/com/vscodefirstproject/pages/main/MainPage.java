package com.vscodefirstproject.pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vscodefirstproject.pages.Basepage;

public class MainPage extends Basepage {

    public MainPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(className = "close home-m-close") // xpath //button[@class='close home-m-close']
    WebElement getcareclosebutton;

    @FindBy(className = "pull-right btn-login-okta") //// a[@class='pull-right btn-login-okta']
    WebElement loginbuttoninitial;

    @FindBy(className = "profile-button")
    WebElement profilebutton;

    public MainPage closebutton() {
        getcareclosebutton.click();
        return this;
    }

    public MainPage openlogin() {
        loginbuttoninitial.click();
        return this;
    }

    public String getUserName() {
        return profilebutton.getText();
    }

}

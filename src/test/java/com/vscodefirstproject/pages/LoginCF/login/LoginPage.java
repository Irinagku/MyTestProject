package com.vscodefirstproject.pages.LoginCF.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.*;

import com.vscodefirstproject.pages.Basepage;

public class LoginPage extends Basepage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "okta-signin-username")
    WebElement username;

    @FindBy(id = "okta-signin-password")
    WebElement password;

    @FindBy(className = "btn btn-primary btn-block")
    WebElement loginbutton;

    @FindBy(className = "col-md-7 col-lg-7 col-sm-12 billing-and-payment pr-0")
    WebElement billingandpaymenttitle;

    // public static final String USER_NAME = "irinagku";
    // public static final String USER_PASSWORD = "Novatskaya#18";//

    public LoginPage loginCF(String userName, String userPassword) {
        username.sendKeys(userName);
        password.sendKeys(userPassword);
        loginbutton.click();
        return this;
    }
}

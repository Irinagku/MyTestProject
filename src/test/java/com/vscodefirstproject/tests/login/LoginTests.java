package com.vscodefirstproject.tests.login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vscodefirstproject.data.Constants;
import com.vscodefirstproject.pages.LoginCF.login.LoginPage;
import com.vscodefirstproject.pages.main.MainPage;
import com.vscodefirstproject.tests.Testbase;

public class LoginTests extends Testbase{
    @BeforeMethod
    public void setup(){
      new MainPage(driver).closebutton().openlogin();

    }

    @Test
    public void loginValidParamTest(){
      new LoginPage(driver).loginCF(Constants.USER_NAME, Constants.USER_PASSWORD);
      Assert.assertTrue(new MainPage(driver).getUserName().contains(Constants.USER_NAME));
    }

}

package com.test.OpenCart.Tests;

import Utils.BrowserUtils;
import com.test.OpenCart.Pages.LoginPageOpencart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends TestBaseForOpenChart {


    @Test


    public void validateLogin(){

       LoginPageOpencart login = new LoginPageOpencart(driver);
       login.ValidateLoginPage("demo","demo");

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=4yrWiV99qkFrpFxn00owJXJmy4jTV7nd");





    }





}

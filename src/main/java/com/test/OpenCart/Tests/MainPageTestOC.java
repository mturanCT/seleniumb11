package com.test.OpenCart.Tests;

import Utils.BrowserUtils;
import com.test.OpenCart.Pages.LoginPageOpencart;
import com.test.OpenCart.Pages.MainPageOpenChart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTestOC extends TestBaseForOpenChart{



    @Test
    public void testForOC(){



        LoginPageOpencart login = new LoginPageOpencart(driver);
        login.ValidateLoginPage("demo","demo");
        MainPageOpenChart main = new MainPageOpenChart(driver);
Assert.assertTrue(main.validationOfMainPage("12K","11.8M","145.4K"));



    }


}

package com.test.orangehrm.tests;

import Utils.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test


    public void validateLoginPositive(){

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));

//        String actualURL = driver.getCurrentUrl();
//        String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");





    }

    @Test
    public void validateLoginNegativeTest1(){

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "mustafa");//changed the password
        loginPage.getErrorMessage();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Invalid credentials";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);


    }

    @Test

    public void NegativeTest2(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");//both empty
        loginPage.getErrorMessage();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Username cannot be empty";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
        String actualColor = loginPage.getColorOfTheErrorMessage();
        String expectedColor="rgba(221, 119, 0, 1)";
        Assert.assertEquals(actualColor,expectedColor);




    }



}

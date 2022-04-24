package com.test.orangehrm;

import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    //I use test base to store my @Before and After method annotations

    public WebDriver driver;//we changed the access modifier to public to use driver in Login test class
    @BeforeMethod

    public void setup(){

        driver=DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("urlorangehrm"));




    }@AfterMethod

    public void tearDown(ITestResult result){
if(!result.isSuccess()){//when it is fail, it is gonna take a screen shot
    BrowserUtils.getScreenShot(driver,"OrangeHrmScreenShot");


}
        DriverHelper.tearDown();


    }



}

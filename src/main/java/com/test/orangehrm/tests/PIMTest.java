package com.test.orangehrm.tests;

import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import com.test.orangehrm.pages.PIMPage;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMTest extends TestBase {
    LoginPage loginPage;  //we make them global variables so they are gonna work for all pages
    MainPage mainPage;
    PIMPage pimPage;

    @BeforeMethod

    public void initializingPages(){


         loginPage= new LoginPage(driver);
         mainPage=  new MainPage(driver);
         pimPage =  new PIMPage(driver);
    }


    @Test

    public void validateTheCreationOfEmployee() throws InterruptedException {
        //LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin","admin123");
       // MainPage mainPage=new MainPage(driver);
        mainPage.clickPimButton();
       // PIMPage pimPage = new PIMPage(driver);
        pimPage.addEmployeeForPim("mustafa","turan","12345","C:\\Users\\dayub\\Desktop\\usa.png");
        Assert.assertEquals(pimPage.validationFirstName(),"mustafa");
        Assert.assertEquals(pimPage.validationlastName(),"turan");
        Assert.assertTrue(pimPage.validationOfEmployeeId("12345"));


    }
@Test
    public void ValidatePersonalDetailElement() throws InterruptedException {

        loginPage.login("Admin","admin123");
        mainPage.clickPimButton();
        pimPage.addEmployeeForPim("mustafa","turan","12345","C:\\Users\\dayub\\Desktop\\usa.png");
        pimPage.editPersonalDetails("Turkish","1979-02-09","Single");

Assert.assertEquals(pimPage.validateNationality(),"Turkish");
Assert.assertEquals(pimPage.validateMaritualStatus(),"Single");

}



}

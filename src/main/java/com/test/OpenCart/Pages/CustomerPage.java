package com.test.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {


    public CustomerPage(WebDriver driver){

        PageFactory.initElements(driver,this);


    }


    @FindBy(xpath = "//a[@class='parent']")
    WebElement customerDropDown;

    @FindBy(xpath = "//a[.='Customers']")

    WebElement customers;

    @FindBy(className = "fa fa-plus")


    WebElement addButton;

//    @FindBy(id = "input-customer-group")
//            WebElement customerGroup;


    @FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(id = "input-lastname")
    WebElement lastName;

    @FindBy(id = "input-email")
    WebElement Email;

    @FindBy(id = "input-telephone")
    WebElement phoneNumber;

    @FindBy(id="input-password")
    WebElement password;

    @FindBy(id = "input-confirm")

    WebElement confirmPassword;

    @FindBy(className = "fa fa-save")
    WebElement saveButton;



    public void fillTheBlanksCustomersPage(){

        customerDropDown.click();
        customers.click();
        addButton.click();
        firstName.sendKeys("Mustafa");
        lastName.sendKeys("Turan");
        Email.sendKeys("abs@yahoo.com");
        phoneNumber.sendKeys("1234567888");
        password.sendKeys("123456");
        confirmPassword.sendKeys("123456");
        saveButton.click();




    }

}

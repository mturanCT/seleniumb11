package com.test.OpenCart.Pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageOpenChart {

    public MainPageOpenChart(WebDriver driver){

        PageFactory.initElements(driver,this);




    }


        @FindBy(xpath = "//h2[.='12K']")

        WebElement totalOrders;


    @FindBy(xpath = "//h2[.='11.8M']")

    WebElement totalSales;

    @FindBy(xpath = "//h2[.='145.4K']")

    WebElement totalCustomers;

    public boolean validationOfMainPage(String totalOrders, String totalSales,String totalCustomers){

        return true;


    }

    }


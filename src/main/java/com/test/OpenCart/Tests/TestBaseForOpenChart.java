package com.test.OpenCart.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseForOpenChart {





        //I use test base to store my @Before and After method annotations

        public WebDriver driver;//we changed the access modifier to public to use driver in Login test class
        @BeforeMethod

        public void setup(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
            driver.manage().window().maximize();



        }@AfterMethod

        public void tearDown(){
            System.out.println("i am running after each test annotation");
           // driver.quit();


        }



    }



package com.test.etsy;

import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class etsyTestBase {


    /*)1)First of all navigate to website "https://www.etsy.com/'
   2)take care of your TestBase
   3)Find searchBox and type iphone 13 case and click searchbox or enter
     I would store my all elements inside of mainPage
   4)I would create a test class and validate all of the headers from search
   includes either iphone,13 or case. If all of them includes it should assert pass

   5)Your search name(iphone 13 case) should come from parameter.xml
   6)You can run your class at the end from TestNG runner.xml

 */


    public class TestBase {



        public WebDriver driver;

        @BeforeMethod

        public void setup() {
              driver=DriverHelper.getDriver();//this is after we create singleton util.driver class
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
              driver.get("https://www.etsy.com/");
//            driver.manage().window().maximize();
//            System.out.println("i am running before every test annotation");


        }

        @AfterMethod

        public void tearDown() {

            DriverHelper.tearDown();


        }
    }
}

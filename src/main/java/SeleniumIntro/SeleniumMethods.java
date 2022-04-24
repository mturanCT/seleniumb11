package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {


    public static void main(String[] args) throws InterruptedException {
//INTERVIEW QUESTION?
// what is the difference between driver get and driver.navigate().to ?

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

// driver.navigate.to()--> it navigates to the webpage

        //interview question;

        //what is the difference between driver.close and driver.quit
        driver.navigate().to("https://www.google.com/");//interview question

       // driver.quit();

       // Thread.sleep(3000);//to make the process slow//you should not use it in your real project...
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
       // System.out.println(driver.getPageSource());NOT COMMON TO USE//it gives html source of the page
        driver.navigate().to("https://www.techtorialacademy.com/");
      //  Thread.sleep(3000);
        driver.navigate().back();//amazon
       // Thread.sleep(3000);
        driver.navigate().forward();//techtorial again
        //Thread.sleep(3000);
        driver.navigate().refresh();//refresh


       driver.close();



    }


}

package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {


    //task: go to 3 websites you decide get the title,current URLand going back . and going back forward with lastly refresh and quit.

    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cnn.com/");//same as below
       // driver.navigate().to("https://www.cnn.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

driver.navigate().to("https://www.apple.com/");
driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        driver.close();

    }








}

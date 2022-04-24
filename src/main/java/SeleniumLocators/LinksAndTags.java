package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {

    public static <Webdriver> void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");
        driver.manage().window().maximize();

        WebElement javalink = driver.findElement(By.linkText("Java"));//should be connected with "a" tag to use this
        javalink.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().back();//we add this to fix the exception-->exception(no such element)


        WebElement selenium = driver.findElement(By.linkText("Selenium"));
  selenium.click();
  driver.navigate().back();
  javalink = driver.findElement(By.linkText("Java"));//after add this, no exception
  javalink.click();
  driver.navigate().back();

//StaleElementReferenceException: we get this exception when the element was on the page
// but my driver is not able to see the element anymore.
       // interview: what is "StaleElementReferenceException" and what condition you get it and handle it?

        // 1-the element values is updated(like attribute)
        //button id = "tect2" when you click this button it updates id(dynamic)
        //WebElement button = driver.findElement(By.id="tec2");
        //button.click();
        //id="tec3"
       // 2- The page is refreshed
        // 3- After  navigating to the other page, if you come back to original and use the same element
        //that you stored before(like java) it will throw this exception.

        //how can you handle?
        //you should reinitialized the webelement one more time.



         //PartialLink(not popular)
        WebElement restApi = driver.findElement(By.partialLinkText("Rest"));
        restApi.click();

driver.navigate().back();


//u-->(u tag) we are checking if it is unique tag
        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());//Use Java Version




    }


}

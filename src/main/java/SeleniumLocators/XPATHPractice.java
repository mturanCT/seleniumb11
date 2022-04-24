package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class XPATHPractice {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");
        WebElement javalink = driver.findElement(By.xpath("//a[@href='https://www.oracle.com/java/']"));

        WebDriver ex1 = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        WebElement title = driver.findElement(By.xpath("//h3"));
        System.out.println(title.getText());
        WebElement ex2 = driver.findElement((By.xpath("//h4[@class='subheader']")));





        //CONTAINS: it works with text
        //tagname[contains(text(),'HorzontalLine')]//useful if there are more h3
        // //h3[contains(text(),'Horizontal Slider')]

WebElement containsmethod = driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));
        System.out.println(containsmethod.getText());







        //Text: it works with text as well.This is simplier than containsmethod.
        //it looks for the exact text


        //h3[.='text']--> if it does not work use contains method
        ////h3[.='Horizontal Slider']





    }
}
package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectBasics {


    @Test
    public void practice1() throws InterruptedException {


//        WebDriverManager.firefoxdriver().setup();//so you don`t need to download the driver if you want to use different browser
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://the-internet.herokuapp.com/");

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/");


        WebElement dropdown = driver.findElement(By.linkText("Dropdown"));
        dropdown.click();
        WebElement optionsBox = driver.findElement(By.id("dropdown"));
        Select option = new Select(optionsBox);//provide webelement location.

        Thread.sleep(1000);
        option.selectByIndex(1);//option 2
        Thread.sleep(1000);
option.selectByValue("2");//value
        Thread.sleep(1000);
        option.selectByVisibleText("Option 1");
        List<WebElement> options = option.getOptions();//give all options

        for (WebElement optn:options){
            System.out.println(optn.getText().trim());


        }

    }





}

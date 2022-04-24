package Waits;

import Utils.DriverHelper;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitlyWaitPractice {

    //
    @Test

    public void validateWait(){
        WebDriver driver = DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div//button"));
        startButton.click();
        WebElement text1 = driver.findElement(By.xpath("//h4[.='Hello World!']"));
        String actual = text1.getText().trim();
        String expectedText = "Hello World!";
        Assert.assertEquals(actual,expectedText);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));//yuo can put text1 here
        //it waits until element is visible
        Assert.assertEquals(text1.getText().trim(),"Hello World!");

    }


}

package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to  ("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Java");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Selenium");

        WebElement button = driver.findElement(By.className("submit-button btn_action"));
        button.click();

        String actualerror = button.getText();
        String expectederror = "Epic sadface: Username and password do not match any user in this service";

        if(expectederror.contains(actualerror)){

            System.out.println("passed");


        }else {

            System.out.println("failed");
        }

    }
}

package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cccc {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Java");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Selenium");
        WebElement button = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        button.click();
        WebElement actualtext = driver.findElement(By.xpath("//h3"));
        System.out.println(actualtext.getText());
        String required = "Epic sadface: Username and password do not match any user in this service";
        if (actualtext.getText().equals(required)) {
            System.out.println("validated");
        } else {
            System.out.println("failed");
        }
    }
}
package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class zhomework {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");

WebElement text = driver.findElement(By.id("techtorial1"));

String actualtext = text.getText();
String expectedtext = "Techtorial Academy";
        if(actualtext.equals(expectedtext)){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }


         WebElement tetx2 = driver.findElement(By.id("details2"));
        System.out.println(tetx2.getText());

        WebElement textclass = driver.findElement(By.className("group_checkbox"));
        String actualclass = textclass.getText();
        String expectedclass="All Tools";
//
        System.out.println(textclass.getText());


         WebElement textname = driver.findElement(By.name("firstName"));
        textname.sendKeys("Mustafa Turan");
        WebElement textlastname = driver.findElement(By.name("lastName"));
        textlastname.sendKeys("Turan");
        WebElement textPhone = driver.findElement(By.name("phone"));
        textPhone.sendKeys("123456");
        WebElement textEmail = driver.findElement(By.name("userName"));
        textEmail.sendKeys("mt@gmail.com");

WebElement javaBox = driver.findElement(By.id("cond1"));
javaBox.click();
        WebElement TestNG = driver.findElement(By.id("cond3"));
        TestNG.click();
        WebElement Cucumber = driver.findElement(By.id("cond4"));
        Cucumber.click();
        System.out.println(Cucumber.isDisplayed());
        System.out.println(Cucumber.isSelected());

        driver.manage().window().maximize();

        WebElement link  = driver.findElement(By.linkText("Java"));
        link.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().back();


    }
}
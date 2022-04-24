package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement fullNameBox =  driver.findElement(By.xpath("//input[@id='userName']"));
        System.out.println(fullNameBox.getText());
        fullNameBox.sendKeys("mustafa turan");
        WebElement emailbox = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailbox.sendKeys("abc@gmail.com");
        WebElement addressbox = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        addressbox.sendKeys("123 Java st. Javaland JV,12345");
        WebElement permanentaddressbox = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentaddressbox.sendKeys("123 Cucumber st. Cucumber CC,56789");

        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();
        WebElement namevailidation = driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(namevailidation.getText());

String expectedValidation = namevailidation.getText();
String actualValidation = "Name:mustafa turan";

if(expectedValidation.contains(actualValidation)){
    System.out.println("passed");


}else{

    System.out.println("failed");
}


    }
}
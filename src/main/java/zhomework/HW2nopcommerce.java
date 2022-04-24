package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2nopcommerce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();

        WebElement gender = driver.findElement(By.xpath("//label[@class='forcheckbox' and @for='gender-male']"));
        gender.click();

        WebElement firstname = driver.findElement(By.xpath("//input[@data-val-required='First name is required.']"));
        firstname.sendKeys("mustafa");
        WebElement lastname = driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']"));
        lastname.sendKeys("turan");

WebElement dobday = driver.findElement(By.name("DateOfBirthDay"));
dobday.sendKeys("9");
        WebElement dobmonth = driver.findElement(By.name("DateOfBirthMonth"));
        dobmonth.sendKeys("February");
        WebElement dobyear = driver.findElement(By.name("DateOfBirthYear"));
        dobyear.sendKeys("1990");

        WebElement email = driver.findElement(By.xpath("//input[@data-val-required='Email is required.']"));
        email.sendKeys("abdgf12348564@gmail.com");

        WebElement click = driver.findElement(By.xpath("//input[@data-val-required='The Newsletter field is required.']"));
        click.click();


        WebElement password = driver.findElement(By.xpath("//input[@data-val-regex-pattern='^.{6,}$']"));
        password.sendKeys("Abcd1234");
        WebElement passwordcheck = driver.findElement(By.xpath("//input[@data-val-equalto='The password and confirmation password do not match.']"));
        passwordcheck.sendKeys("Abcd1234");

        WebElement register3 = driver.findElement(By.id("register-button"));
        Thread.sleep(3000);
        register3.click();



        WebElement validation = driver.findElement(By.xpath("//div[@class='result']"));

        String actualVerificationText = validation.getText();
        String expectedVerificationText = "Your registration completed";

        if(actualVerificationText.contains(expectedVerificationText)){

            System.out.println("passed");


        }else{

            System.out.println("failed");
        }


    }
}

package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HWamazon {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());


        WebElement helloClick = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        helloClick.click();
        WebElement accountsignin = driver.findElement(By.linkText("Create your Amazon account"));
        accountsignin.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.xpath("//input[@name='customerName' and @class='a-input-text a-span12 auth-autofocus auth-required-field']"));
        name.sendKeys("mustafa turan");
        WebElement phonenumber = driver.findElement(By.xpath("//input[@id='ap_email' and @tabindex='3']"));
        phonenumber.sendKeys("2031234567");


        WebElement password = driver.findElement(By.xpath("//input[@placeholder='At least 6 characters']"));
        password.sendKeys("Mus4C9451234");
        WebElement passwordcheck = driver.findElement(By.xpath("//input[@name='passwordCheck']"));
        passwordcheck.sendKeys("Mus4C9451234");













    }
}

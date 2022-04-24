package Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice {

    @Test

    public void iframeTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame("mce_0_ifr");

        WebElement clear = driver.findElement(By.xpath("//body/p"));
        clear.clear();
        clear.sendKeys("I love Java");
        WebElement text = driver.findElement(By.tagName("h3"));
        String ac = text.getText();
        String ex = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(ac,ex);

        //CHECK VIDEO TO COMLETE

//it is under the iframe so we cannot do anything...after we put driver.switchTo().frame("mce_0_ifr");it worked


    }





}

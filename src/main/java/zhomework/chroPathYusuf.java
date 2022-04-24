package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chroPathYusuf {


    @Test
    public void chroPath() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html#");
      //  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]"));
        //element.click();


        driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]")).click();driver.navigate().back();
        driver.findElement(By.xpath("//a[contains(0text(),'SAP HR/HCM')]")).click();driver.navigate().back();
        driver.findElement(By.xpath("//a[contains(text(),'SAP CO')]")).click();driver.navigate().back();
        driver.findElement(By.xpath("//a[contains(text(),'Agile Testing')]")).click();driver.navigate().back();
        driver.findElement(By.xpath("//header/div[1]/div[1]/a[2]/*[1]")).click();driver.navigate().back();



    }
}
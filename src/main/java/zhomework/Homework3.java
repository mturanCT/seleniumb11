package zhomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework3 {

    @Test

    public void homework3CAse1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");

        driver.manage().window().maximize();
        WebElement shiromi = driver.findElement(By.xpath("//img[@title=Shiromi]"));
        shiromi.click();
        WebElement shromiNext = driver.findElement(By.xpath("//a[@id='navigate-next']"));
        shromiNext.click();
        WebElement tekka = driver.findElement(By.xpath("//h1[.='Tekka maki']"));
        String actualTekka = tekka.getText();
        String expectedTekka = "Tekka maki";
        Assert.assertEquals(actualTekka, expectedTekka);
        WebElement arrowBack = driver.findElement(By.xpath("//a[@id='navigate-prev']"));
        arrowBack.click();
        WebElement shiromiBack = driver.findElement(By.xpath("//img[@title=Shiromi]"));
        String actualSh = shiromiBack.getText();
        String expectedsh = "Shiromi";
        Assert.assertEquals(actualSh, expectedsh);
        WebElement cart = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
        String actualCart = cart.getText();
        String expectedCart = "0";
        Assert.assertEquals(actualCart, expectedCart);


    }

    @Test

    public void Case2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        WebElement addCartEdamame = driver.findElement(By.xpath("//li[@data-uid='c81ffcdf-2bc8-47e6-b2a3-ba1c4b948dcc']//button"));
        addCartEdamame.click();
        WebElement item = driver.findElement(By.xpath("//input[@title=\"1.00\"]"));
        String actualCartitem = item.getText();
        String expectedcartitem = "1.00";
        Assert.assertEquals(actualCartitem, expectedcartitem);
        WebElement price = driver.findElement(By.xpath("//p//span"));
        String actualPrice = price.getText();
        String expectedPrice = "$4.00";
        Assert.assertEquals(actualPrice, expectedPrice);


    }

    @Test
    public void Case3() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        WebElement salmonPicture = driver.findElement(By.xpath("//img[@title='Salmon Teriyaki']"));
        salmonPicture.click();
        WebElement doubleclickSlamon = driver.findElement(By.xpath("//div//button[@class='buy']"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleclickSlamon).perform();
        WebElement totalPrice = driver.findElement(By.xpath("//p[@class=\"total-price\"]"));
        String actualPrice = totalPrice.getText();
        String expectedPrice = "$26.00";
        WebElement item1 = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
        String actualitem1 = item1.getText();
        String expecteditem1 = "1";
        Assert.assertEquals(actualPrice,expectedPrice);
        WebElement clickNext = driver.findElement(By.xpath("//a[@id='navigate-next' and @href='#/menu/17']"));
        clickNext.click();
        WebElement clickGohan = driver.findElement(By.xpath("//section//button"));
        clickGohan.click();


    }
}
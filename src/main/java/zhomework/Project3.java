package zhomework;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Project3 {


    @Test


    public static void Case1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement cartEmpty = driver.findElement(By.xpath("//span[@class='ajax_cart_no_product']"));
        boolean validateCartEmpty = cartEmpty.isDisplayed();
        Assert.assertTrue(validateCartEmpty);

        List<WebElement> priceList = driver.findElements(By.xpath("//ul[@id=\"homefeatured\"]//div[@class='right-block']//h5//following-sibling::p//following-sibling::div//following-sibling::span[@class='price product-price']"));
        double actual =0;

        for (WebElement price1 : priceList) {
            actual+=Double.parseDouble(price1.getText().substring(1));


        }
        System.out.println(actual);
        double expected =196.38;

Assert.assertEquals(actual,expected);

    }


    @Test

    public void Case2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        List<WebElement> priceList = driver.findElements(By.xpath("//ul[@id=\"homefeatured\"]//div[@class='right-block']//h5//following-sibling::p//following-sibling::div//following-sibling::span[@class='price product-price']"));
        TreeSet<String> theCheapestPrice = new TreeSet<String>();

       for(WebElement theCheapest:priceList){
            theCheapestPrice.add(theCheapest.getText());

       }
        System.out.println(theCheapestPrice.first());



        }
@Test

    public void TestCase3() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    Actions actions = new Actions(driver);
    WebElement addCArt = driver.findElement(By.xpath("//ul[@id='homefeatured']//img[@title='Faded Short Sleeve T-shirts']"));

    actions.moveToElement(addCArt);

    WebElement addCart = driver.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//a[@data-id-product='1']//span]"));


}


    }



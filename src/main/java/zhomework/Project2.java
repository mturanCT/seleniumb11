package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Project2 {
    private static WebDriver driver;

    //********TEST CASE 4 ***********

    @Test
    public static void validateTestCase4() throws InterruptedException {


        driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password' and @style='width:142px']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Thread.sleep(2000);
        loginButton.click();

        WebElement orderButton = driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]"));
        orderButton.click();

        WebElement screenSaver = driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct"));
        screenSaver.sendKeys("ScreenSaver");

        WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys("15");
        WebElement customerName = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        customerName.sendKeys("Techtorial Academy");

        WebElement street = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        street.sendKeys("2200 E devon");

        WebElement city = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys("Des Plaines");

        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        state.sendKeys("Illinois");

        WebElement zipCode = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zipCode.sendKeys("60018");

        WebElement paymentMastercard = driver.findElement(By.xpath("//label[@for=\"ctl00_MainContent_fmwOrder_cardList_1\"]"));
        Thread.sleep(2000);
        paymentMastercard.click();

        WebElement cardNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
        cardNumber.sendKeys("444993876233");

        WebElement expirationNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
        expirationNumber.sendKeys("03/21");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        Thread.sleep(2000);
        processButton.click();


        WebElement orderConfirm = driver.findElement(By.xpath("//strong"));
        boolean actualValidateConfirmDisplayed = orderConfirm.isDisplayed();
        boolean expectedValidateConfirmDisplayed = true;
        Assert.assertEquals(actualValidateConfirmDisplayed, expectedValidateConfirmDisplayed);


        WebElement allOrders = driver.findElement(By.linkText("View all orders"));
        Thread.sleep(1000);
        allOrders.click();

    }

    @Test
//Validate if new order is added.

    public void validateNewOrder() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password' and @style='width:142px']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Thread.sleep(2000);
        loginButton.click();

        WebElement orderButton = driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]"));
        orderButton.click();

        WebElement screenSaver = driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct"));
        screenSaver.sendKeys("ScreenSaver");

        WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys("15");
        WebElement customerName = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        customerName.sendKeys("Techtorial Academy");

        WebElement street = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        street.sendKeys("2200 E devon");

        WebElement city = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys("Des Plaines");

        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        state.sendKeys("Illinois");

        WebElement zipCode = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zipCode.sendKeys("60018");

        WebElement paymentMastercard = driver.findElement(By.xpath("//label[@for=\"ctl00_MainContent_fmwOrder_cardList_1\"]"));
        Thread.sleep(2000);
        paymentMastercard.click();

        WebElement cardNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
        cardNumber.sendKeys("444993876233");

        WebElement expirationNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
        expirationNumber.sendKeys("03/21");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        Thread.sleep(2000);
        processButton.click();


        WebElement allOrders = driver.findElement(By.linkText("View all orders"));
        Thread.sleep(1000);
        allOrders.click();
    }

    @Test

    public void validateinputs() {

        List<WebElement> validateinput = driver.findElements(By.xpath("//tbody/tr[2]/td"));


       // for()
    }


}
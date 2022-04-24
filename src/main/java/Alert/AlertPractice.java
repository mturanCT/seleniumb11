package Alert;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPractice {


    /*(ALERT CLASS)
    1)Navigate to "https://sweetalert.js.org/"
    2)Click first preview(which is on the bottom left one)
    3)Validate the text on pop-up
    4)Handle the pop up

     */

    @Test

    public void JSAlert() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        WebElement preview = driver.findElement(By.xpath("//button[@class='preview']"));
        Thread.sleep(2000);
        preview.click();
        Alert alert = driver.switchTo().alert();
        String actual = alert.getText();
        String expected = "Oops, something went wrong!";
        Assert.assertEquals(actual, expected);
        alert.accept();


    }

    @Test

    public void JSAlertHtlmAlert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        WebElement htmlPopUp = driver.findElement(By.xpath("//button[@onclick=\"swal('Oops', 'Something went wrong!', 'error')\"]"));
        htmlPopUp.click();
        Alert alert = driver.switchTo().alert();
        String actualhtml = alert.getText();
        String expected = "swal('Oops', 'Something went wrong!', 'error')";
        Assert.assertEquals(actualhtml, expected);
//we tried to handle the popup using aleert class, but it did not work(failed)



    }
@Test
    public void JSAlertHtlmAlert2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        WebElement htmlPopUp2 = driver.findElement(By.xpath("//button[@onclick=\"swal('Oops', 'Something went wrong!', 'error')\"]"));
        htmlPopUp2.click();
        Thread.sleep(2000);
        WebElement htmlpreview = driver.findElement(By.xpath("//div[.='Something went wrong!']"));

        String actual = BrowserUtils.getTextMethod(htmlpreview);
        String expected = "Something went wrong!";
        Assert.assertEquals(actual,expected);





    }
}
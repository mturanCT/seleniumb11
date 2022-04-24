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

public class AlertIntro {


@Test

    public void JSBAsicAlertTest() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.manage().window().maximize();
    WebElement clickJSAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
    clickJSAlert.click();
//    WebElement header = driver.findElement(By.tagName("h3"));
//    System.out.println(header.getText());//UnhandledAlertException
    Alert alert = driver.switchTo().alert();
    String actual = alert.getText();
    String expected = "I am a JS Alert";
    Assert.assertEquals(actual, expected);
    alert.accept();

    WebElement actual1 = driver.findElement(By.xpath("//p[@id=\"result\"]"));
    String acctual = BrowserUtils.getTextMethod(actual1);
    String expected1 = "You successfully clicked an alert";
    Assert.assertEquals(acctual, expected1);

    WebElement JSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
    JSConfirm.click();
    String actualJSConfirm = alert.getText();
    String expectedJSConfirm = "I am a JS Confirm";
    Assert.assertEquals(actualJSConfirm, expectedJSConfirm);
    alert.dismiss();

//JS confirm
    WebElement clickCancel = driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));

    String actualcancel = clickCancel.getText();
    String expectedCancel = "You clicked: Cancel";

    Assert.assertEquals(actualcancel, expectedCancel);

}
    @Test
    public void SendKEys() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement JSprompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

        JSprompt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Mustafa");
        alert.accept();

        WebElement mustafa = driver.findElement(By.xpath("//p[.='You entered: Mustafa']"));
        String actualM = mustafa.getText();
        String expectedM = "You entered: Mustafa";
        Assert.assertEquals(actualM,expectedM);


    }

}


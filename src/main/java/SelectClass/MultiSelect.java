package SelectClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MultiSelect {

@Test
    public void multipleSelectAndFirstSelectPractice() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");
        driver.manage().window().maximize();
        WebElement header = driver.findElement(By.id("techtorial1"));
        BrowserUtils.getTextMethod(header);

    WebElement multiSelectBox = driver.findElement(By.xpath("//select[@class='select']"));
    BrowserUtils .selectBy(multiSelectBox,"Two","text");
    BrowserUtils.selectBy(multiSelectBox,"3","index");
    BrowserUtils.selectBy(multiSelectBox,"1","value");


    Select select =new Select(multiSelectBox);
    Thread.sleep(2000);

    select.deselectByIndex(3);
    select.deselectAll();

    //***getFirstSelectedOption
    // trim()--> it removes the space from both side of the string.
    WebElement countryList = driver.findElement(By.name("country"));
    Select country = new Select(countryList);
   // String actualFirstSelectedOption = country.getFirstSelectedOption().getText().trim();
    String actualFirstSelectedOption = BrowserUtils.getTextMethod(country.getFirstSelectedOption());

    String expectedFirstSelectedOption="UNITED STATES";//fail if there is space at the end.
    Assert.assertEquals(actualFirstSelectedOption,expectedFirstSelectedOption);



    }
}

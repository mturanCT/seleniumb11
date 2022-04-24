package zhomework;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework4 {

    @Test

    public void Case1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://uitestpractice.com/Students/Select#");
        driver.manage().window().maximize();
        WebElement indiaDefault = driver.findElement(By.xpath("//select//option[@value='india']"));
        boolean actualDefault = indiaDefault.isDisplayed();
        boolean expectedDefault = true;
        Assert.assertEquals(actualDefault,expectedDefault);

        List<WebElement> sizeDropdown = driver.findElements(By.xpath("//select[@id='countriesMultiple']//option"));
        int actualsize = sizeDropdown.size();
        int expectdsize = 4;
        Assert.assertEquals(actualsize,expectdsize);

        List<WebElement> sizeDropdown1 = driver.findElements(By.xpath("//select[@id='countriesMultiple']//option"));
        List<String> actualList = new ArrayList<>();
        List<String>expectedList = Arrays.asList("India","United states of America","China","England");

            for(WebElement actualList1:sizeDropdown) {

actualList.add(actualList1.getText().trim());



            }Assert.assertEquals(actualList,expectedList);

        WebElement chinaIndex = driver.findElement(By.xpath("//select[@id='countriesMultiple']"));
        Select select = new Select(chinaIndex);
        select.selectByIndex(2);
        select.selectByValue("england");
        select.selectByValue("United states of America");



    }


}

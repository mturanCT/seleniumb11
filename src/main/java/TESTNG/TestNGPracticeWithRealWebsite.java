package TESTNG;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGPracticeWithRealWebsite {


    @Test //I am testing the website is correct or not
    public void validateWebsite() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        String actualWebsite = driver.getCurrentUrl();
        String expectedWebsite = "https://demo.opencart.com/admin/";
        Assert.assertEquals(actualWebsite, expectedWebsite);
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


    }

    @Test

    public void validateCatalogisDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        boolean actualcatalog = catalogBar.isDisplayed();
        boolean expectedcatalog = true;
        Assert.assertEquals(actualcatalog,expectedcatalog,"catalog is not here");
        catalogBar.click();


    }
@Test
    public void validateProductIsDisplayed(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement productBar = driver.findElement(By.xpath("//a[.='Products']"));
        boolean actualProductBar = productBar.isDisplayed();
        boolean expectedProductBar = true;
        Assert.assertEquals(actualProductBar,expectedProductBar);
        productBar.click();



    }
    @Test
    public void validationOfBoxes() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        WebElement catalogBar = driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement productBar = driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(1000);
              productBar.click();
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i=1;i<boxes.size();i++){
Thread.sleep(500);
            boxes.get(i).click();
            boolean ActualboxValidation = boxes.get(i).isDisplayed();
            boolean ExpectedboxValidation=true;
            Assert.assertEquals(ActualboxValidation,ExpectedboxValidation);
            boolean AcTualBoxValidationisSelected = boxes.get(i).isSelected();
            boolean ExpectedValidationBoxSelected = true;
            Assert.assertEquals(AcTualBoxValidationisSelected,ExpectedValidationBoxSelected);




        }



    }
}
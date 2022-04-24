package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class zMypagesStepDefs {

    WebDriver driver;


    @When("i navigate to the Slick deals home page")
    public void i_navigate_to_the_slick_deals_home_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to("https://slickdeals.net/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement popup = driver.findElement(By.xpath("//button[@class='QSIWebResponsiveDialog-Layout1-SI_2dZnRwiK1Hy6s3R_close-btn']"));
        popup.click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();

    }


    @Then("enter search box laptops")
    public void enter_search_box_laptops() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='bp-p-slickdealsHeaderSearch_input js-bound']"));
        searchBox.sendKeys("Laptop", Keys.ENTER);



    }


    @Then("there are {int} deals on the first page")
    public void there_are_deals_on_the_first_page(Integer expectedNumber) {

        List<WebElement>allDeals = driver.findElements(By.xpath("//div[@class='dealWrapper']"));
        Assert.assertTrue(allDeals.size()>expectedNumber);

    }
}

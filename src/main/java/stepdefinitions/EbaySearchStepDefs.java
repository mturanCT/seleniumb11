package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class EbaySearchStepDefs {
WebDriver driver;
    @Given("user is on ebay homepage")
    public void user_is_on_ebay_homepage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");


    }

    @When("user searches for imac 2020")
    public void user_searches_for_imac() throws InterruptedException {

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        searchBox.sendKeys("imac 2020",Keys.ENTER);





    }

    @Then("user sees results about iMac only")
    public void user_sees_results_about_i_mac_only() {

        List<WebElement> allTheHeaders = driver.findElements(By.xpath("//ul//a//h3[@class='s-item__title']"));
        for (WebElement headers:allTheHeaders ){
            System.out.println(headers.getText().trim());
            Assert.assertTrue(headers.getText().toLowerCase().contains("imac"));


        }


    }

    @Then("there are more than {int} pages of results")
    public void there_are_more_than_pages_of_results(Integer expectedpages) {

        List <WebElement> pageNumbers = driver.findElements(By.xpath("//ol[@class=\"pagination__items\"]//li"));
        Assert.assertTrue(pageNumbers.size()>expectedpages);

    }
}

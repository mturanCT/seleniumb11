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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectClassExample {


    @Test

    public void validationTripButton() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement onewayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        onewayButton.click();
        Assert.assertTrue(onewayButton.isDisplayed());//it must be true to pass the assertion
        //Assert.assertFalse(onewayButton.isSelected());//negative senario
        Assert.assertTrue(onewayButton.isSelected());

        WebElement roundtripButton = driver.findElement(By.xpath("//input[@value='roundtrip']"));
        Assert.assertFalse(roundtripButton.isSelected());
        Assert.assertTrue(roundtripButton.isDisplayed());

    }


    @Test
    public void SelectMethods() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement onewayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        onewayButton.click();


   WebElement passengerCount = driver.findElement(By.name("passCount"));
        Select psnger =new Select(passengerCount);
        psnger.selectByIndex(1);
        WebElement departFrom = driver.findElement(By.name("fromPort"));
        Select depart = new Select(departFrom);
        depart.selectByValue("Sydney");//we dont look for if unique or not,bcz it is coming from the box

        WebElement month = driver.findElement(By.name("fromMonth"));
        Select smnth=new Select(month);
        smnth.selectByVisibleText("April");

        WebElement fromDay = driver.findElement(By.name("fromDay"));
        Select fmday = new Select(fromDay);
        fmday.selectByValue("3");

        WebElement arriveTo = driver.findElement(By.name("toPort"));
        Select arrive = new Select(arriveTo);
        arrive.selectByValue("Seattle");

        WebElement returningMonth = driver.findElement(By.name("toMonth"));
        Select return1=new Select(returningMonth);
        return1.selectByVisibleText("October");

        WebElement returnDay = driver.findElement(By.name("toDay"));
        Select day = new Select(returnDay);
        day.selectByValue("4");


        WebElement airlinePreference = driver.findElement(By.name("airline"));
        Select prefernce = new Select(airlinePreference);
        prefernce.selectByVisibleText("Unified Airlines");
        Thread.sleep(2000);

        WebElement ference = driver.findElement(By.name("airline"));
        Select efernce = new Select(ference);
        efernce.selectByIndex(1);


        WebElement continueButton = driver.findElement(By.name("findFlights"));
        continueButton.click();



    }

    @Test

    public void secondWay() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement trip = driver.findElement(By.xpath("//input[@value='oneway']"));
        trip.click();
        WebElement passenger = driver.findElement(By.name("passCount"));
        BrowserUtils.selectBy(passenger,"2","value");
        WebElement departingFrom = driver.findElement(By.name("fromPort"));
        BrowserUtils.selectBy(departingFrom,"Paris","text");
        WebElement frommonth = driver.findElement(By.name("fromMonth"));
        BrowserUtils.selectBy(frommonth,"7","index");
        WebElement fromday = driver.findElement(By.name("fromDay"));
        BrowserUtils.selectBy(fromday,"13","value");
        WebElement arrivingIn = driver.findElement(By.name("toPort"));
        BrowserUtils.selectBy(arrivingIn,"Sydney","text");
        WebElement tomonth = driver.findElement(By.name("toMonth"));
        BrowserUtils.selectBy(tomonth,"9","index");
        WebElement toDay = driver.findElement(By.name("toDay"));
        BrowserUtils.selectBy(toDay,"3","value");
        WebElement Services = driver.findElement(By.xpath("//input[@value='First']"));
        Services.click();
        WebElement airlines = driver.findElement(By.name("airline"));
        BrowserUtils.selectBy(frommonth,"7","index");
        Select airline = new Select(airlines);
        List<WebElement> allairlines = airline.getOptions();
        List<String> actualAirlines = Arrays.asList("No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines");
        List<String> expectedairlines = new ArrayList<>();
        for (WebElement line : allairlines) {
            expectedairlines.add(line.getText().trim());
        }
        Assert.assertEquals(actualAirlines, expectedairlines);
        WebElement continueButton = driver.findElement(By.name("findFlights"));
        continueButton.click();
        WebElement message = driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']//font[@size='4']"));
        String actual = message.getText().trim();
        String expected = "After flight finder - No Seats Available";
        Assert.assertEquals(actual,expected);
    }
}
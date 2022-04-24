package WindowHandle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsHandlingTask {


/*  /*
    1)navigate to the "https://www.hyrtutorials.com/p/window-handles-practice.html"
    2)Click open multiple tabs under button 4
    3)switch back to Basic Controls and validate the header(Basic Controls)
    4)Fill all the boxes and click register
    5)validate the message"Registration is Successful";
    6)Go back to Alert tabs and click the one of the click me box
    7)Close all the tabs
    8)Enjoy the chocolate if you are top5
     */



        @Test
        public void Practice() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
            driver.manage().window().maximize();
            WebElement click = driver.findElement(By.xpath("//button[@onclick='newBrowserTabs()']"));
            click.click();

            BrowserUtils.switchByTitle(driver,"Basic Controls -  H Y R Tutorials");

            WebElement basicControls = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
            String actual = basicControls.getText();
            String expected="Basic Controls";
            Assert.assertEquals(actual,expected);

            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
            firstName.sendKeys("mustafa");
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
            lastName.sendKeys("turan");
            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            email.sendKeys("mustafa@yahoo.com");
            WebElement gender = driver.findElement(By.xpath("//input[@name='gender']"));
           gender.click();
           WebElement language = driver.findElement(By.xpath("//input[@id='englishchbx']"));
           language.click();
           WebElement elem = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
           elem.sendKeys("12345");
           WebElement register = driver.findElement(By.xpath("//button[@id='registerbtn']"));
           register.click();
           WebElement validatonRegister = driver.findElement(By.xpath("//label[@id='msg']"));
           String ac = validatonRegister.getText();
           String ex = "Registration is Successful";
           Assert.assertEquals(ac,ex);

BrowserUtils.switchByTitle(driver,"AlertsDemo");


WebElement click2 = driver.findElement(By.xpath("//button[@id=\"alertBox\"]"));
click2.click();
Thread.sleep(2000);
driver.quit();

        }


    }


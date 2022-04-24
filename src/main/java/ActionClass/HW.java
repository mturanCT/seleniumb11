package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class HW {

    @Test
    public void homeworkEdureka() throws InterruptedException {
//1) GO to the Edureka.co 2) Hover over the categories/browser 3) hoverover cybersecurity 4)validate the 3 names of cybersecurity

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.navigate().to("https://www.edureka.co/");
        driver.manage().window().maximize();
        WebElement browse= driver.findElement(By.xpath("//a/span [.='Categories']"));
       // Thread.sleep(2000);
        //browse.click();


        Actions action = new Actions(driver);
        action.moveToElement(browse).perform();
        WebElement cyber = driver.findElement(By.xpath("//a[.='Cyber Security' and @class='dropdown-toggle ga_top_category']"));
        action.moveToElement(cyber).perform();

        WebElement cyberList = driver.findElement(By.partialLinkText("Cyber Security"));


       // List<WebElement> cyberList =


////1) GO to the Edureka.co 2) Hover over the categories/browser 3) hoverover cybersecurity 4)validate the 3 names of cybersecurity



    }
}

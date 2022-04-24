package FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTeask {

    /*
1)Navigate to the "https://demo.guru99.com/test/upload/
2)Upload the usa.png file on the website
3)Click the box (I accept terms of service)
4)validate box is selected
5)Click submit button
6)Validate the message "1 file has been successfully uploaded."
 */

    @Test
    public void Practice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.id("uploadfile_0"));
        upload.sendKeys("C:\\Users\\dayub\\Desktop\\usa.png");
        WebElement clickTerms = driver.findElement(By.id("terms"));
        clickTerms.click();
        Assert.assertTrue(clickTerms.isSelected());
        WebElement submitButton = driver.findElement(By.id("submitbutton"));

        submitButton.click();

        Thread.sleep(2000);
    }
}
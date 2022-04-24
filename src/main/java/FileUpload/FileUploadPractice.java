package FileUpload;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPractice {

@Test

    public void validateFileUpload(){


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://the-internet.herokuapp.com/upload");
    driver.manage().window().maximize();
    WebElement chooseFile = driver.findElement(By.id("file-upload"));
    chooseFile.sendKeys("C:\\Users\\dayub\\Desktop\\usa.png");
    WebElement uploadButton= driver.findElement(By.id("file-submit"));
    uploadButton.click();
    WebElement fileUpload = driver.findElement(By.tagName("h3"));
    String actual = BrowserUtils.getTextMethod(fileUpload);
    String expected="File Uploaded!";
    Assert.assertEquals(actual,expected);

    WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
    String actual1  = BrowserUtils.getTextMethod(uploadedFile);
    String expected1  ="usa.png" ;
    Assert.assertEquals(actual1,expected1);



}

}

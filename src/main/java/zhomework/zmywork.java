package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zmywork {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");
        WebElement ex = driver.findElement(By.linkText("Java"));
      ex.click();
        driver.navigate().back();

        WebElement ex1 = driver.findElement(By.linkText("Selenium"));
        ex1.click();
        driver.navigate().back();
        ex = driver.findElement(By.linkText("Java"));
        ex.click();
        //driver.quit();

        driver.navigate().back();


        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());


        WebElement xpath = driver.findElement(By.xpath("//a[@href='https://www.oracle.com/java/']"));
      xpath.click();

        //a[@href='https://www.oracle.com/java/']

    }
}

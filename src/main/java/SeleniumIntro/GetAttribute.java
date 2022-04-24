package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement google = driver.findElement(By.name("btnK"));
        System.out.println(google.getText());
        WebElement displayed = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        System.out.println(displayed.isDisplayed());
        System.out.println(google.getAttribute("value"));//Google Search
        System.out.println(google.getAttribute("aria-label"));//Google Search
        if(google.getAttribute("value").equals(("Google Search"))){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }
    }

}

package zhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class fl {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> list1 = driver.findElements(By.xpath("//li/a"));
        int count=0;
        for(WebElement list2:list1) {

            if (list2.getText().length()<=12) {

                System.out.println(list2.getText());
                count++;
            }



        }System.out.println(count);






driver.navigate().to("https://www.cnn.com/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
WebElement test = driver.findElement(By.linkText("Stolen crypto"));
test.click();



    }
}

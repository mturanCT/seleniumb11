package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com/");
        driver.manage().window().maximize();
        WebElement news  = driver.findElement(By.xpath("//a[@href='https://news.yahoo.com/' and @class='_yb_hu5ch  rapid-noclick-resp']"));
news.click();
Thread.sleep(2000);
        //System.out.println(driver.getCurrentUrl());
        List<WebElement> links= driver.findElements(By.xpath("//h3[@class='Mb(5px)']"));

        //for(WebElement news1:links) {
            for (int i=0;i<links.size();i++) {//another for implementation

                if (links.get(i).getText().toUpperCase().contains("TRUMP"))

                    System.out.println(links.get(i).getText());

            }





        }


        }









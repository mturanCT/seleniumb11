package WindowHandle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {



    @Test

    public void practice1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();
        WebElement header = driver.findElement(By.xpath("//a[.='Click Here']"));
        System.out.println(header.getText());
//it is failing bcz my driver is still pointing the last tab.It throws the Nosuchelelment exception





    }
@Test

    public void switchingWindow(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/windows");
    System.out.println((driver.getWindowHandle()));
    WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
    clickHere.click();
    System.out.println(driver.getWindowHandles());
    //WebElement header = driver.findElement(By.xpath("//h3[.='New Window']"));
    String mainPageId = driver.getWindowHandle();//123
    Set<String> allPagesID = driver.getWindowHandles();//123,563

    //this implementation for only 2 tabs

    for(String id:allPagesID){

        System.out.println(id);
        if(!id.equals(mainPageId)){

            driver.switchTo().window(id);

        }
    }
    WebElement header = driver.findElement(By.xpath("//h3[.='New Window']"));
    System.out.println(header.getText());
    String actual = header.getText();
    String expected = "New Window";
    Assert.assertEquals(actual,expected);

}
@Test

    public void Pracitce(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    String mainPageId2 = driver.getWindowHandle();//we put here to make sure to get the main page id
    WebElement tab  = driver.findElement(By.id("newTabBtn"));
    tab.click();

    BrowserUtils.SwitchOnlyForTwoTabs(driver, mainPageId2);


//    Set<String> allPagesID4 = driver.getWindowHandles();
//
//    for(String ids:allPagesID4){
//
//        System.out.println(ids);
//        if(!ids.equals(mainPageId2)){
//
//            driver.switchTo().window(ids);
//
//        }
//    }


    WebElement header1 = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));

    String actual = header1.getText();
    String expected = "AlertsDemo";
    Assert.assertEquals(actual,expected);

    WebElement click = driver.findElement(By.xpath("//button[@id='alertBox']"));
    click.click();

    //h1[@class='post-title entry-title']
}

}

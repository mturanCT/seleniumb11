package JavaScriptExecuter;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptMethods {

    //whenever normal methods are not working then last decison you should use javascript,
    //otherwise not common to use.
    @Test

    public void TitleMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());//sometimes says you cannot get the title
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;//we are casting here
      //  String title = javascriptExecutor.executeScript("return document.title").toString();
        //we have WRITE in the parantehesis
        //System.out.println(title+"from javascript");

        String actualTitle = BrowserUtils.GetTitleWithJavaScript(driver);
        String expectedTitle ="Home Page - Techtorial";
        Assert.assertEquals(actualTitle,expectedTitle);



    }

    @Test
    public void ClickWithJS(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");

        driver.manage().window().maximize();
        WebElement browseCourse = driver.findElement(By.xpath("//a[.='Browse Course']"));
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript ("arguments[0].click()",browseCourse);
        BrowserUtils.ClickWithJS(driver,browseCourse);//we created a method in BrowserUtil class, so we dont need to use
                                                       //above codes




    }


@Test
    public void clickWithJavaScript(){

        // we use this method often

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.techtorialacademy.com/");
    JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    WebElement studentLogin = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Student login']"));
    BrowserUtils.ClickWithJS(driver,studentLogin);

    





}
@Test//****

    public void ScrollIntoView(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyRight = driver.findElement(By.xpath("//p[.='© Copyrights 2021 Techtorial - All Rights Reserved']"));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",copyRight);//scroll down until copyrights



}

@Test

    public void practice() {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.techtorialacademy.com/");
    WebElement Browse = driver.findElement(By.xpath("//a[.='Browse Course']"));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    BrowserUtils.ClickWithJS(driver,Browse);
    WebElement apply = driver.findElement(By.xpath("//h4['On-Campus Course']//..//a"));
    BrowserUtils.ClickWithJS(driver,apply);
    BrowserUtils.ScrollWithJS(driver,apply);
    BrowserUtils.ScrollWithJS(driver,apply);




}
@Test

    public void ScroolWithXandYCoordinantTest(){

        // this is an interview question(POINT CLASS)


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.techtorialacademy.com/");
    WebElement copyRight = driver.findElement(By.xpath("//p[.='© Copyrights 2021 Techtorial - All Rights Reserved']"));
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    Point location = copyRight.getLocation();//created POINT class
////    System.out.println(location.getX());//this is not needed
////    System.out.println(location.getY());//    ""
//    int xCord = location.getX();
//    int yCord = location.getY();
//    js.executeScript("window.scrollTo("+xCord+","+yCord+")");
    BrowserUtils.scrollWithXandYCord(driver,copyRight);// we created method in browser utils.


}







}



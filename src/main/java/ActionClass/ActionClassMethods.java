package ActionClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ActionClassMethods {

    //whwatever you do with your mouse and keyboard,actionClass does it.

    //ContectClick()---> right click
    @Test
    public void ContextClick(){

        //ContextClick()-->right click

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            WebElement contextMenu=driver.findElement(By.partialLinkText("Context"));
            contextMenu.click();
            WebElement box=driver.findElement(By.id("hot-spot"));
            Actions actions = new Actions(driver);
            //ACTION CLASS YOU MUST USE PERFORM AT THE END.
            actions.contextClick(box).perform();
        }
        @Test
        public void HoverOver() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            WebElement Hover = driver.findElement(By.linkText("Hovers"));
            Hover.click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            List<WebElement> names = driver.findElements(By.tagName("h5"));
            List<WebElement> pictures = driver.findElements(By.xpath("//div[@class='figure']/img"));
            List<String> expectedNames = Arrays.asList("name: user1", "name: user2", "name: user3");//this is for small size items
            for (int i = 0; i < names.size(); i++) {
                Thread.sleep(2000);
                actions.moveToElement(pictures.get(i)).perform();//hover over here
                Assert.assertEquals(BrowserUtils.getTextMethod(names.get(i)), expectedNames.get(i));
                System.out.println(BrowserUtils.getTextMethod(names.get(i)));//get text here
            }




        }

@Test

    public void doubleClick(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement doubclickButton = driver.findElement(By.tagName("button"));
        Actions action = new Actions(driver);
        //action.doubleClick(doubclickButton).perform();

        WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions acton1 = new Actions(driver);
        acton1.contextClick(rightClick).perform();




}
@Test

public void dragAndDrop(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        WebElement dragAndDrop = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));//copied below
        String actualMessage = BrowserUtils.getTextMethod(orangeBox);
        String expectedMessage="... Or here.";//-->business requirement
    Assert.assertEquals(actualMessage,expectedMessage);

    Actions action = new Actions(driver);
    action.dragAndDrop(dragAndDrop,orangeBox).perform();
    orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));//we copy here bcz message is dynamic..after the drop message is changing
    WebElement acceptCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
    //this is for to click accept cookies window

    String actualAfterDragAndDrop = BrowserUtils.getTextMethod(orangeBox);
    String expectedAfterDragAndDrop = "You did great!";
    Assert.assertEquals(actualAfterDragAndDrop,expectedAfterDragAndDrop);

    // validate the color
    String actualCssValue = orangeBox.getCssValue("background-color");//
    String expectedCssValue ="rgba(238, 111, 11, 1)";//we converted #ee6f0b; from colorpicker(from google)

    Assert.assertEquals(actualCssValue,expectedCssValue);



}

@Test

public void ClickAndHold(){//it is not really useful

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
    driver.manage().window().maximize();
    WebElement bluebox = driver.findElement(By.xpath("//div[@class='test1']"));
    String actualBlueBoxMessage = BrowserUtils.getTextMethod(bluebox);
    String expectedBlueBoxMessage ="Drag the small circle here ...";
    Assert.assertEquals(actualBlueBoxMessage,expectedBlueBoxMessage);
    WebElement dragAndDrop = driver.findElement(By.xpath("//div[@id='draggable']"));
    Actions actions = new Actions(driver);
    actions.clickAndHold(dragAndDrop).moveToElement(bluebox).release().perform();



}


@Test
public void PlanBpractice() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://demos.telerik.com/kendo-ui/fx/expand");
    driver.manage().window().maximize();
    List<WebElement> pictures=driver.findElements(By.xpath("//div[@role='listitem']"));
    List<WebElement> allPrices=driver.findElements(By.xpath("//div[@class='product-description']//p"));
    List<Double> prices=new ArrayList<>();
    Actions actions=new Actions(driver);
    for(int i = 0; i<pictures.size();i++){
        Thread.sleep(1000);
        actions.moveToElement(pictures.get(i)).perform();
        prices.add(Double.parseDouble(allPrices.get(i).getText().trim().replace("$","")));
    }
    Collections.sort(prices);
    System.out.println(prices);
    Collections.reverse(prices);
    System.out.println(prices);
}
@Test
    public void MoveByOffSet(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(0,0).perform();




}
@Test
    public void Slider() throws InterruptedException {//short cut for testing Slider

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/horizontal_slider");
    driver.manage().window().maximize();
    WebElement slider = driver.findElement(By.xpath("//input"));
    WebElement range = driver.findElement(By.xpath("//span[@id='range']"));
    String myrange="5";
    while (!range.getText().trim().equals(myrange)){
        Thread.sleep(500);
        slider.sendKeys(Keys.ARROW_RIGHT);


    }



}
@Test
    public void MoveByOffsetPractice(){

        //by using move by off set and point class
    //click contact us

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("http://www.techtorialacademy.com/");
    WebElement contactUs=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
    driver.manage().window().maximize();
    Point coordinatesOfContactUs=contactUs.getLocation();
    int xCoord=coordinatesOfContactUs.getX();
    int yCoord=coordinatesOfContactUs.getY();
    Actions actions = new Actions(driver);
    actions.moveByOffset(xCoord,yCoord).click().perform();
}


}



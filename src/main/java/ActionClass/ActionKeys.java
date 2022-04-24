package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionKeys {

    @Test
   public void Keys() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement googlesearchbox = driver.findElement(By.name("q"));//pay attention here how we find
        actions.moveToElement(googlesearchbox)
                .click().keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("elenium")
                .doubleClick().keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.ENTER).perform();//dont forget the enter and perform at the enter.

        //googlesearchbox.sendKeys("Seleniumselenium");
        //***Important Notes for Keys;
        //Keys.ENTER or Keys.Return
        //Keys.Arrow right/left/up/down

    }
/*TASK FOR STUDENTS:
1)navigate to the Website "https://text-compare.com/"
2)Type with the Keys --> "Good Bye Keys"
3)with CTRL(COMMAND)+A --> select all text
4)Copy this text CTRL(COMMAND) + C --> it will copy the text
5)Go to the second box and paste CTRL(COMMAND) + V-->it will paste the text
6) Validate this two boxes text are matching*/

        @Test
        public void TaskKeys(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://text-compare.com/");
            driver.manage().window().maximize();
            WebElement text1 = driver.findElement(By.id("inputText1"));
            WebElement text2 = driver.findElement(By.id("inputText2"));
            Actions action = new Actions(driver);
            action.moveToElement(text1)
                    .click().keyDown(Keys.SHIFT)
                    .sendKeys("g")
                    .sendKeys("ood")
                    .click().keyDown(Keys.SPACE)
                    .click().keyUp(Keys.SPACE)
                    .sendKeys("Bye")
                    .click().keyDown(Keys.SPACE)
                    .click().keyUp(Keys.SPACE)
                    .sendKeys("Keys")
                    .sendKeys(Keys.ENTER).perform();

//****finish this














}
}
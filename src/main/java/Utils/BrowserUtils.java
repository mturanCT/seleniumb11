package Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BrowserUtils {
    public static void selectBy(WebElement element, String value, String methodName) {
        Select select = new Select(element);
        switch (methodName) {

            case "text":
                select.selectByVisibleText(value);
                break;

            case "index":
                select.selectByIndex(Integer.parseInt(value));//**we parse it
                break;

            case "value":
                select.selectByValue(value);
                break;

            default:
                System.out.println("Method name is not available, use text, value or index for method name");
        }
        // to use this method in another class use this syntax:
        // BrowserUtils.selectBy(passengerCount, "2", "value");
        //we used this method in "public class SelectClassExample"


    }

    public static String getTextMethod(WebElement element) {
        return element.getText();//String actualFirstSelectedOption = BrowserUtils.getTextMethod(country.getFirstSelectedOption());
        // WebElement header = driver.findElement(By.id("techtorial1"));
        //BrowserUtils.getTextMethod(header);

    }

    public static String GetTitleWithJavaScript(WebDriver driver) {

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;//we are casting here
        String title = javascriptExecutor.executeScript("return document.title").toString();
        return title;


    }

    @Test

    public static void ClickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);


    }

    public static void ScrollWithJS(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);


    }

    public static void scrollWithXandYCord(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Point location = element.getLocation();//created POINT class
        int xCord = location.getX();
        int yCord = location.getY();

        js.executeScript("window.scrollTo(" + xCord + "," + yCord + ")");

    }


    public static void SwitchOnlyForTwoTabs(WebDriver driver, String mainPageId) {

        Set<String> allPagesID4 = driver.getWindowHandles();

        for (String ids : allPagesID4) {

            System.out.println(ids);
            if (!ids.equals(mainPageId)) {

                driver.switchTo().window(ids);

            }
        }


    }

    public static void switchByTitle(WebDriver driver, String title) {
        // in real work this will help you a lot  ,once you test different tabs or windows


        Set<String> allPages = driver.getWindowHandles();
        for (String id : allPages) {//internet--> new window
            driver.switchTo().window(id);
            if (driver.getTitle().contains(title)) {

                break;


            }


        }
    }

    public static void getScreenShot(WebDriver driver, String packageName) {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("user.dir") + "src/java/screenshot" + packageName;
        try {
            FileUtils.copyFile(file, new File(location + System.currentTimeMillis()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test


    public void testtt() {
        // get the duplicated value
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 5, 8, 9, 0, 0, 9, 9));

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(list);

        System.out.println(set2);


    }
}
package SeleniumLocators;

import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/dayub/Desktop/Techtorial%20_Selenium_Exercise.html");

                //getText()--> it gives you the text of the element.
                WebElement header = driver.findElement(By.id("techtorial1"));
        String actualText=header.getText();//from the system
        String expectedText="Techtorial Academy"; //from the business requirement
        if(actualText.equals(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        WebElement paragraph=driver.findElement(By.id("details2"));
        System.out.println(paragraph.getText());




                // LOCATOR: ClassName


        WebElement tools = driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());
        //note: if you provide wrong path for the webelement.it will throw an exception which is called"NoSuchElementException"

        //LOCATER:Name

        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("mustafa");


        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("turan");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("123458");

        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("jhfrbvlwhj@gmail.com");

        WebElement javaBox = driver.findElement(By.id("cond1"));
        javaBox.click();//it goes to website and click the java box
        System.out.println(javaBox.isDisplayed());;//return true//we validate this
        System.out.println(javaBox.isSelected());;//return true

        WebElement testNG = driver.findElement(By.id("cond3"));
        testNG.click();
        WebElement cucumber = driver.findElement(By.id("cond4"));
        cucumber.click();


    }
}

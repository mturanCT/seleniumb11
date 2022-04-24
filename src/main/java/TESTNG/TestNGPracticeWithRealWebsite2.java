package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestNGPracticeWithRealWebsite2 {
    @Test

    public void validationOfAscendingOrderofOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        Thread.sleep(1000);
        options.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        Set<String> actualOptionsOrder = new LinkedHashSet<>();//linkedhashset accepts insertion order
        Set<String> expectedOptionsOrder = new TreeSet<>();//ascending order
        for (WebElement option:allOptions){

            actualOptionsOrder.add(option.getText().trim());
            expectedOptionsOrder.add(option.getText().trim());



        }
        Assert.assertEquals(actualOptionsOrder,expectedOptionsOrder);//you can put inside loop or outside if you use linkedhashmap.

    }

    @Test
    public void validationOfDescendingOrderOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        Thread.sleep(1000);
        options.click();

        WebElement optionNameButton = driver.findElement(By.xpath("//a[.='Option Name']"));
        optionNameButton.click();


        List<WebElement> descendingallOptions = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<String> actualDescendingOrder = new LinkedList<>();
        List<String> expectedDescendingOrder = new ArrayList<>();//descending we can use arraylist
        // we used list here..

        for(int i=0;i<descendingallOptions.size();i++){

            actualDescendingOrder.add(descendingallOptions.get(i).getText().trim());

            expectedDescendingOrder.add(descendingallOptions.get(i).getText().trim());

            Collections.sort(expectedDescendingOrder);//we used list to use this collection.sort method..
            Collections.reverse(expectedDescendingOrder);
            //  Collections.reverse(expectedDescendingOrder); we did negative test here by commanding here



        } Assert.assertEquals(actualDescendingOrder,expectedDescendingOrder);




    }

    @Test

    public void validationOfDescendingSortOrder() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        Thread.sleep(1000);
        options.click();

        WebElement sort = driver.findElement(By.xpath("//a[.='Sort Order']"));
        sort.click();


     List<WebElement> descendingSortOrder= driver.findElements(By.xpath("//tbody/tr/td[3]"));
     List<String> actualDescendingSortOrder = new ArrayList<>();
     List<String> expectedDescendingSortOrder = new ArrayList<>();

        System.out.println(descendingSortOrder);
     for(int i=0;i<descendingSortOrder.size();i++) {
         actualDescendingSortOrder.add(descendingSortOrder.get(i).getText().trim());
         expectedDescendingSortOrder.add(descendingSortOrder.get(i).getText().trim());


     }Assert.assertEquals(actualDescendingSortOrder,expectedDescendingSortOrder);






    }

    @Test

    public void validationOfAscendingSortOrder() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement options = driver.findElement(By.xpath("//a[.='Options']"));
        Thread.sleep(1000);
        options.click();

        WebElement sort = driver.findElement(By.xpath("//a[.='Sort Order']"));
        Thread.sleep(1000);
        sort.click();

        WebElement doubleClickSort = driver.findElement(By.xpath("//a[.='Sort Order']"));
        Thread.sleep(1000);
        doubleClickSort.click();

        List<WebElement> ascendingSortOrder= driver.findElements(By.xpath("//tbody/tr/td[3]"));
        Set<String> actualAscendingSortOrder = new TreeSet<>();
        Set<String> expectedAscendingSortOrder = new TreeSet<>();

        for(WebElement orders:ascendingSortOrder){
          actualAscendingSortOrder.add(orders.getText().trim());
            expectedAscendingSortOrder.add(orders.getText().trim());




        }Assert.assertEquals(actualAscendingSortOrder,expectedAscendingSortOrder);




    }



//    HOMEWORK: GO TO THE OPTIONS, TEST THE SORT BUTTON FUNCTIONS:
//    1)ONCE YOU CLICK IT SHOULD BE ASCENDING ORDER
//    2)SECOND TIME CLICK IT SHOULD BE DESCENDING ORDER BY TOMORROW








}
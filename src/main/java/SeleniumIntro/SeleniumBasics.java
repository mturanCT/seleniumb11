package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {


    public static void main(String[] args) {

        //step1: we need to define the chrome driver into the project as  a property.

        System.setProperty("webdriver.chorome.driver","chromedriver.exe");
        //windows user add .exe at the end

        //step2 :
        //we need to instantiate(declare) our driver.

        WebDriver driver = new ChromeDriver();//creating object.
        //driver is a reference name.Webdriver is a interface
        //new ChromeDriver()--> new object
        //interview Question:
        //Where do you use polymorphism in your testing framework?
        //I use it instantiate my driver like (driver is a reference name.Webdriver)
        //SECOND interview ques.;
        //can you instantiate your driver like
        // Webdriver driver=new Webdriver();//we cannot bcz we cannot create object in abstract class
        //ChromeDriver driver=new ChromeDriver()//ok



        //FIRST METHOD:

        //Get(); it navigates to the given url.
        driver.get("https://www.techtorialacademy.com/");
        driver.manage().window().maximize();//it has to be used right after the web address
        driver.getTitle();

        // getTitle()--> method to get the title of the page.

        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Home Page - Techtorial")){

            System.out.println("your test is passed");

        }else {

            System.out.println("failed");
        }



//driver.getCurrentUrl(); it gets the given URL

        String actual = driver.getCurrentUrl();
        String expected = "https://www.techtorialacademy.com/";
        if(actual.equals(expected)){
            System.out.println("Passed");



        }else {
            System.out.println("Failed");
        }




    }



}

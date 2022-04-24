package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TESTNGAssertion {


    //create one method that takes 2 parameters and return the
    //multilication og=f the se numbers

    public double mul(double a, double b){

        return a*b;
    }

    @Test
    public void validateMultiplication(){

        double actualResult = mul(5,6);
        double expectedResult=30;


        Assert.assertEquals(actualResult,expectedResult,"my numbers are 5 and 6");
        //it is going to show if it fails

    }
public double Division(double x,double y){

        if(x>y){

            return x/y;
        }
        return y/x;
}

public int substraction(int r,int b){

    if(r>=b){

        return r-b;
    }
    return b-r;

}

@Test
    public void validateDivison(){

        double Actualresult1 = Division(15,3);
        double Expectedresult1 = 5;

        Assert.assertEquals(Actualresult1,Expectedresult1,"my numbers are 15 and 3");


}
@Test

//@Test
//public void validateSubstraction(){
//    int actualResult=substraction(65,43);
//    int expectedResult=22;
//    Assert.assertEquals(actualResult,expectedResult);
//    double actualResulfOfDivision=getDivision(6,3);
//    double expectedResultOfDivison=2;
//    Assert.assertEquals(actualResulfOfDivision,expectedResultOfDivison);

 //   ****NOTE. you can write combine two in one test annotation

//NOTE 1:
//If one of the @Test fails, the next Test will be still executed.(It means each Test
//Annotation is independent)
//NOTE 2:
//If one of the Assertion fails it will immediately stop for this TEST annotion.
//example:
//    Assert.asserequal(5,3);//actual and expected is not matching,it will fail.
//    Assert.assertequal(4,4);//this one will not be executed because of the first assertion fails.



    public void validateSubstraction(){
        int actualresult3 = substraction(10,5);
        int expectedresult3 = 10-5;

           Assert.assertEquals(actualresult3,expectedresult3);



}






    }




package TESTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
    @Parameters("FirstName")//if it is just one
    @Test(priority = 1,invocationCount = 10)//run 10 times

    public void test2(String name) {

        System.out.println(name);

    }
        @Parameters({"City", "State"})//curly braces if more than 2
        @Test(priority = 2,invocationTimeOut = 2000)//it will wait for 2 seconds then fail

        public void test1(String city,String state){


            System.out.println(city);
            System.out.println(state);
        }

    }

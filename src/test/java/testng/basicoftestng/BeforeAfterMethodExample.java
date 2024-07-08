package testng.basicoftestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample
{
    @BeforeMethod
    public void beforeMethodDemo() {
        System.out.println("Before Method");
    }

        @Test
        public void testCase_1(){
            System.out.println("Test Case 1");

        }
    @Test
    public void testCase_2(){
        System.out.println("Test Case 2");

    }
    @Test
    public void testCase_3(){
        System.out.println("Test Case 3");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }



}


package testng.basicoftestng;

import org.testng.annotations.*;

public class BeforeClassAfterClass
{
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class ");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class ");
    }
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

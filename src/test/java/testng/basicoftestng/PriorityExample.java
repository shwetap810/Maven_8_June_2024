
package testng.basicoftestng;

import org.testng.annotations.Test;

import javax.swing.*;

public class PriorityExample
{
    @Test(priority = 1,groups = {"smoke"})
    public void testCase_F()
    {
        System.out.println("test case F");
    }
    @Test
    public void testCase_B(){
        System.out.println("test case B");
    }
    @Test
    public void testCase_J(){
        System.out.println("test case J");
    }
    @Test(priority = 'd')
    public void testCase_A(){
        System.out.println("test case A");
    }
    @Test(priority = 2)
    public void testCase_z(){
        System.out.println("test case Z");
    }
    @Test(priority = -3)
    public void testCase_M(){
        System.out.println("test case M");
    }
   /* @Test(priority = 2.34f)   //we cant give float as priority
    public void testCase_K(){
        System.out.println("test case K");
    }*/
}

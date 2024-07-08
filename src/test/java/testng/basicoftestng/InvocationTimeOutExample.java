package testng.basicoftestng;

import org.testng.annotations.Test;

public class InvocationTimeOutExample
{
    // when test case not run in given time frame it shows ThreadTimeOutException

    @Test(invocationCount = 10, invocationTimeOut = 3)
    public void invocationTimeOutExample(){
        System.out.println("Invocation Time Out Example");
    }
}

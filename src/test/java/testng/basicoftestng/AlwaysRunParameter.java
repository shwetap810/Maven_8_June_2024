package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunParameter
{
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test
    public void createUser(){
        System.out.println("Create New User");
    }
    @Test(dependsOnMethods = "verifyLogin",alwaysRun = true)
    public void fundTransfer(){
        System.out.println("Fund Transfer");
    }
}

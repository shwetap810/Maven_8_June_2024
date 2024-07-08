package testng.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample
{
    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test
    public void createUser(){
        System.out.println("Create New User");
    }
    @Test(dependsOnMethods = "verifyLogin")
    public void fundTransfer(){
        System.out.println("Fund Transfer");
    }
}

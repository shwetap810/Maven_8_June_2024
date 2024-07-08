package testng.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample
{
    @Test(groups = {"smoke"})
    public void verifyFundTransfer(){
        Assert.assertTrue(true );
        System.out.println("Verify fund transfer");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransferWithSaving(){
        System.out.println("verify fund transfer with saving");
    }

    @Test
    public void verifyCashBackOffer(){
        System.out.println("verify Cash Back Offer");
    }
}

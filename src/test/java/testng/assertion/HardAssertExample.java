package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample
{
    @Test
    public void verifyHardAssertStatement(){
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        Assert.assertEquals(textTitle,"create a Rediffmail account","Text should be Create a Rediffmail account");
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        Assert.assertTrue(usernameTextBox.isDisplayed(),"Username Textbox should be display");
        driver.close();

        //Assert is class
    }
}

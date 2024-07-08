package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample
{
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
    }
    @Test
    public void testCase1()
    {
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
    }
    @Test
    public void testCase2()
    {
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();

    }
}



package testng.failtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertionExample
{
    @Test
    public void softAssert_1(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(textTitle, "create a Rediffmail account", "Text should be Create a Rediffmail account");
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertTrue(usernameTextBox.isDisplayed(), "Username Textbox should be display");
        softAssert.assertAll();
        driver.close();
    }
    @Test
    public void softAssert_2(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void softAssert_3(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.close();

    }

}

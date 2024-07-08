package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SimpleDataProviderAnnotation {
    @DataProvider(name = "test-data")
    public Object[][]  dataProviderFun(){
        return new Object[][]{
                {"selenium", "mumbai"},
                {"java", "pune"},
                {"python", "chennai"} };
    }
    @Test(dataProvider = "test-data")
    public void verifyBestInstitute (String courseName, String cityName ) throws InterruptedException {
        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(courseName + " " + cityName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}

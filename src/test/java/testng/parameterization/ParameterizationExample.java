package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
    public WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("web driver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("web driver.Edge.driver", "C:\\Users\\Dell\\Downloads\\edged river_win32\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("please select the correct browser");
        }
    }
        @Parameters({"courseName", "cityName"})
        @Test
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

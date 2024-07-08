package mavenexample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicScreenShot
{
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("Web driver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\Screenshot (6)"+ timestamp()+".png");
        FileUtils.copyFile(src,des);
        //driver.close();

    }
    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}


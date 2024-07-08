package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcelSheet
{
    @DataProvider(name = "test-data")
    public Object[][]  dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\Dell\\Documents\\TestData.xlsx","TestData");
        return arrObj;
    }
    public String[][] getExcelData(String filePath,String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColm = row.getLastCellNum();

        Cell cell;
        String[][] data = new String[noOfRows - 1][noOfColm];
        for (int i = 1; i < noOfRows-1; i++) {
            for (int j = 0; j < noOfColm; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }return data;
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

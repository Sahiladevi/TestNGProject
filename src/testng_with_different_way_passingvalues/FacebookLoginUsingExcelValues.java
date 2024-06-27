package testng_with_different_way_passingvalues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginUsingExcelValues {
	@DataProvider
	public Object[][] testData() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook book =WorkbookFactory.create(new FileInputStream("../automation_selenium_testng/testdata/FacebookDetails.xlsx"));
		Sheet sheet = book.getSheet("MultipleLoginCredentials");
		int rowCount = sheet.getLastRowNum();
		short cellCount =sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rowCount][cellCount];
		for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
			Row row = sheet.getRow(rowNum);
			for (int cellNum= 0; cellNum < cellCount; cellNum++) {
				String data = row.getCell(cellNum).toString();
				obj[rowNum-1][cellNum]=data;				
			}			
		}
		return obj;
	}	
	
	@Test(dataProvider = "testData")
	public void getDataFromDataProvider(String email, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}


}

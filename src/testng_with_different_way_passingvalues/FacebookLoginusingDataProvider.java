package testng_with_different_way_passingvalues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginusingDataProvider {
	@DataProvider
	public Object[][] testData()
	{
		Object[][] obj = new Object[][] {
			{"admin1@gmail.com","manager1"},
			{"admin2@gmail.com","mangaer2"},
			{"admin3","manager3"}
		};
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

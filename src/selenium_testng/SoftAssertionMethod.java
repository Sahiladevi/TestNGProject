package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionMethod {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://sahiladevi/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(driver.getTitle().equalsIgnoreCase("xyz"));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
	

}

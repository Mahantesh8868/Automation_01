import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng
{

	WebDriver driver;

	@BeforeMethod
	public void open() 
	{
		System.setProperty("webdriver.chrome.driver", "./pgms/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void close() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(2000);

	}

	public class sample extends Testng
	{
		@Test
		public void Utube() throws InterruptedException
		{
			driver.get("https://www.youtube.com");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannada songs");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(
					"//a[@title='Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films']"))
					.click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//div[.='Skip Ads'])[2]")).click();
			Thread.sleep(7000);
		}

	}
}

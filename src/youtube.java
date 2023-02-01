import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class youtube
{
 public static void main(String[] args) throws InterruptedException, IOException
 {
	 System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://o360qa01.chrlab.com/main.aspx");
	 driver.manage().window().maximize();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("(//input[@name='UserName'])[1]")).sendKeys("OMNIA\\Mkure");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("(//input[@name='Password'])[1]")).sendKeys("Standard123");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("(//input[@name='Password'])[1]/../../div[4]/span")).click();
	 TakesScreenshot ss = (TakesScreenshot) driver;
	 File src = ss.getScreenshotAs(OutputType.FILE);
	File file = new File("./screenshots/404error.jpeg");
	FileHandler.copy(src, file);
	
}
}

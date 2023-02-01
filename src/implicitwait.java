import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.get("https://o360qa01.chrlab.com/main.aspx");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//input[@name='UserName'])[1]")).sendKeys("OMNIA\\Mkure");
		 driver.findElement(By.xpath("(//input[@name='Password'])[1]")).sendKeys("Standard123");
		 driver.findElement(By.xpath("(//input[@name='Password'])[1]/../../div[4]/span")).click();
		
	}

}

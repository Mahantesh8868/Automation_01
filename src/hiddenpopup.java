import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[.='31']")).click();
		driver.findElement(By.id("search_btn")).click();
		
	}

}

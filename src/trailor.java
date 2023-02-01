import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trailor 
{
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannada songs");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[@title='Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[.='Skip Ads'])[2]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[@aria-label='Guru Shishyaru | Aane Maadi Heluteeni | Sharaan |Nishvika|Tharun |B.Ajneesh Loknath|Jadeshaa K Hampi by Anand Audio 7 months ago 5 minutes, 10 seconds 28,303,759 views']")).click();
	}
}

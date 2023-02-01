import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 for (int i = 0; i < 4; i++)
		 {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	
	}

	}}

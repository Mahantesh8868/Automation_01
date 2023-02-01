import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.get("https://www.instagram.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username")))).sendKeys("9168357512");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mk@020299");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@role='link']")))).click();
		driver.findElement(By.xpath("(//button)[@type='button'][1]")).click();
	}

}

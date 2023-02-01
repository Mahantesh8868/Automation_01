import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		WebElement mouse = driver.findElement(By.xpath("//a[.='More']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		driver.findElement(By.xpath("//a[.='File Upload']")).click();
		 WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		browse.sendKeys("C:\\Users\\mkure\\OneDrive - CHR Solutions, Inc\\Pictures\\Screenshots");
}
}
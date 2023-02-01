import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//body[.='Parent frame']")).getText());
		driver.switchTo().defaultContent();
		WebElement inner = driver.findElement(By.xpath("/html/body/iframe"));
		driver.switchTo().frame("inner");
		System.out.println(driver.findElement(By.xpath("//p[.='Child Iframe']")).getText());
	}

}

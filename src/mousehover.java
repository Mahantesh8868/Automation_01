import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.amazon.com");
		WebElement add = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions act = new Actions(driver);
		act.moveToElement(add).perform();
	}

}

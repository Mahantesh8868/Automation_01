import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dajhfd");
		driver.findElement(By.xpath("// button[@type='submit']")).click();
		WebElement text = driver.findElement(By.xpath("(//a[.='Forgotten password?'])[1]"));
		String text1 = text.getText();
		System.out.println(text1);
		
	}

}

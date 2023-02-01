import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ok_alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert ok = driver.switchTo().alert();
		Thread.sleep(1000);
		ok.accept();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']              ")).click();
		driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']")).click();
		Thread.sleep(3000);
		Alert cancel = driver.switchTo().alert();
		cancel.dismiss();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(3000);
		Alert cancel1 = driver.switchTo().alert();
		cancel1.dismiss();
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleframe
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./pgms/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome");
}

}

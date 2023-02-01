import org.testng.annotations.Test;

public class NewTest {
  
  @Test(priority=3)
  public void beforeMethod()
  {
	  System.out.println("open the browser");
  }

  @Test(priority=2)
  public void afterMethod()
  {
	  System.out.println("close the browser");
	  
  }
  @Test(priority=1)
  public void demp()
  {
	  System.out.println("perform action");
  }	

}

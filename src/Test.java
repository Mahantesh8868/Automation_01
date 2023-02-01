import org.testng.Reporter;


public class Test 
{
	@org.testng.annotations.Test
	public void demo()
	{
		//Reporter.log("start",true);
		System.out.println("i am learning testNG");
	}
	@org.testng.annotations.Test
	public void dummy()
	{
		Reporter.log("end",true);
	}
		
	
}

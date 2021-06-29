package selenium.testng.NoonSeleniumTestNG;

import org.testng.annotations.Test;

public class MyTestClass2 
{
	@Test(groups = {"kishore"},description = "MyClass2 test1 case")
	public void testOne()
	{
		System.out.println("MyTestClass2 test one case");
	}
	@Test(groups = {"anbu"},description = "MyClass2 test1 case",timeOut = 3000)
	public void testTwo()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyTestClass2 test two case");
	}
}

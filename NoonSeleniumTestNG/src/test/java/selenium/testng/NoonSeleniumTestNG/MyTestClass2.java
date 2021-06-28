package selenium.testng.NoonSeleniumTestNG;

import org.testng.annotations.Test;

public class MyTestClass2 
{
	@Test(groups = {"kishore"})
	public void testOne()
	{
		System.out.println("MyTestClass2 test one case");
	}
	@Test(groups = {"anbu"})
	public void testTwo()
	{
		System.out.println("MyTestClass2 test two case");
	}
}

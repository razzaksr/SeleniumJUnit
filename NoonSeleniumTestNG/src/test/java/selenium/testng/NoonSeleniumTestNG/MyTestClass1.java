package selenium.testng.NoonSeleniumTestNG;

import org.testng.annotations.Test;

public class MyTestClass1
{
	@Test(priority = 4)
	public void sample()
	{
		System.out.println("Sample code");
	}
	@Test(priority = 2)
	public void simple()
	{
		System.out.println("Simple testcase from MyTestClass1");
	}
	@Test(groups = {"anbu","kishore"},priority = 3)
	public void sandal()
	{
		System.out.println("Sandal test case in MyTestClass1");
	}
	@Test(groups = {"kishore"},priority = 1)
	public void sign()
	{
		System.out.println("Sign test case in MyTestClass1");
	}
	@Test(groups = {"anbu"},priority = 5)
	public void santhoor()
	{
		System.out.println("Santhoor test case in MyTestClass1");
	}
}

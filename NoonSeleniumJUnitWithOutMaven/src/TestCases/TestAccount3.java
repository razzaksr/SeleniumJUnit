package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAccount3 
{
	@BeforeSuite
	public void hai()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void hi()
	{
		System.out.println("Before Test");
	}
	@AfterClass
	public void aClass()
	{
		System.out.println("After Class");
	}
	@BeforeClass
	public void bClass()
	{
		System.out.println("Before Class");
	}
	@AfterTest
	public void hiThere()
	{
		System.out.println("Aftre Test");
	}
	@AfterSuite
	public void haiThere()
	{
		System.out.println("After Suite");
	}
}

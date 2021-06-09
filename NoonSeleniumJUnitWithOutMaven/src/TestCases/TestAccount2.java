package TestCases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Models.Account;

public class TestAccount2 
{
	Account a1=new Account("Sidhukumar",8765456789L,876.2);
	Account a2=new Account("Anbumani",9876567871L,1276.0);
	Account a3=new Account("Kishore",12321232323L,8972.87);
	Account[] hai=new Account[] {a1,a2,a3};
	
	@BeforeClass
	public static void tamilnadu()
	{
		System.out.println(" Testing class is runnning");
	}
	
	@Before
	public void salem()
	{
		System.out.println("Test case gonna execute");
	}
	
	@Test
	public void test1()
	{
		assertEquals("Anbumani", hai[1].getHolder());
	}
	@Test
	public void test2()
	{
		assertSame(a3,hai[2]);
	}
	@Test
	public void test3()
	{
		Account[] hey=new Account[] {a1,a2,a3};
		assertArrayEquals(hey,hai);
	}
	
	@After
	public void mettur()
	{
		System.out.println("Test case done");
	}
	@AfterClass
	public static void india()
	{
		System.out.println("All test functions are executed well");
	}
}

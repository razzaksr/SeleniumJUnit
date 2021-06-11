package TestCases;

import org.junit.BeforeClass;
import org.junit.Test;

import Models.Warehouse;

public class TestWarehouse 
{
	static Warehouse ware;
	@BeforeClass
	public static void one()
	{
		ware=new Warehouse();
	}
	@Test(timeout = 6000)
	public void testSort()
	{
		ware.sort();
	}
	@Test
	public void testPrint()
	{
		ware.print();
	}
}

package selenium.testng.NoonSeleniumTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestClass3 
{
	@Test
	@Parameters({"num1","num2"})
	public void testAlpha(int cup,int kat)
	{
		assertEquals((cup+kat),20);
	}
	@Test
	@Parameters({"num3","num4"})
	public void testBeta(int cup,int kat)
	{
		assertTrue((cup*kat)>50);
	}
	@Test
	@Parameters({"statement"})
	public void testCosmo(String line)
	{
		assertSame(line.length(),10);
	}
	@Test
	@Parameters({"data1","data2"})
	public void tetsDelta(Double km,int liter)
	{
		assertFalse((km/liter)>40);
	}
}

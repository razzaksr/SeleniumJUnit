package selenium.testng.NoonSeleniumTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(selenium.testng.NoonSeleniumTestNG.AnbuListener.class)
public class MyTestClass4 
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
	@Test(timeOut = 2000)
	@Parameters({"statement"})
	public void testCosmo(String line)
	{
		assertSame(line.length(),10);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	@Parameters({"data1","data2"})
	public void tetsDelta(Double km,int liter)
	{
		assertFalse((km/liter)>40);
	}
}

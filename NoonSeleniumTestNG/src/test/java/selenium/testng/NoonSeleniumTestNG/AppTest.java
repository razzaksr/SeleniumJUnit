package selenium.testng.NoonSeleniumTestNG;

import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Providers pro;
	@AfterSuite
    public void apple()
    {
    	System.out.println("Apple Pie is first android version");
    }
	@AfterClass
    public void banana()
    {
    	System.out.println("Bananabread is second android version");
    }
	@BeforeClass
    public void cupcake()
    {
    	System.out.println("Before class method will initalize objects");
    	pro=new Providers();
    }
    @BeforeSuite
    public void eclairs()
    {
    	System.out.println("Before suite");
    }
    @Test
    public void testAdd()
    {
    	assertTrue(pro.adding(90));
    	assertTrue(pro.adding(67));
    	assertTrue(pro.adding(12));
    }
    
    @Test(enabled = false)
    public void testOutCome()
    {
    	pro.adding(10);pro.adding(45);pro.adding(55);pro.adding(36);pro.adding(88);pro.adding(22);
    	assertSame(9, pro.length());
    }
    
    @BeforeMethod
    public void froyo()
    {
    	System.out.println("Froyo is fifth android version");
    }
    @AfterMethod
    public void gingerbread()
    {
    	System.out.println("Gingerbread is sixth android version");
    }
    @BeforeTest
    public void icecream()
    {
    	System.out.println("Icecream is seventh version of android");
    }
    @AfterTest
    public void jellybean()
    {
    	System.out.println("Jelly bean is eigth version of android");
    }
}

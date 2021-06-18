package selenium.testng.NoonSeleniumTestNG;

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
    	System.out.println("Cupcake is third android version");
    }
    @BeforeSuite
    public void eclairs()
    {
    	System.out.println("Eclairs, is fifth version of android");
    }
    @Test
    public void donut()
    {
    	System.out.println("Donut is fourth android version");
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

package sample.selenium.junit.NoonSeleniumJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	@org.testng.annotations.Test
    public void hai()
    {
    	Account acc=new Account();
    	acc.setNumber(9876545678L);acc.setBalance(3200.3);acc.setHolder("Sidhukumar");
    	assertEquals("Sidhukumar", acc.getHolder());
    	//assertEquals(3200.3, acc.getBalance());
    }
}

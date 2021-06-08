package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Models.Account;



public class TestAccount1 
{
	@Test
	public void hai()
	{
		Account acc=new Account();
		acc.setBalance(9873.1);acc.setHolder("Sidhukumar");acc.setNumber(8765456789L);
		assertEquals("Sidhukumar", acc.getHolder());
	}
}

package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;

import Models.Account;

public class TestAccount1 
{
	Account acc3;
	@Test
	public void hai()
	{
		Account acc=new Account();
		acc.setBalance(9873.1);acc.setHolder("Sidhukumar");acc.setNumber(8765456789L);
		assertEquals("Sidhukumar", acc.getHolder());
	}
	@Ignore
	@Test
	public void hello()
	{
		Account acc=new Account();
		acc.setBalance(9873.1);acc.setHolder("Sidhukumar");acc.setNumber(8765456789L);
		Account acc1=new Account();
		acc1.setBalance(12600.8);acc1.setHolder("Anbumani");acc1.setNumber(9876567871L);
		Account acc2=new Account();
		acc2.setBalance(201.1);acc2.setHolder("Kishore");acc2.setNumber(12321232323L);
		assertNull(acc3);
		assertEquals(99999999999L, acc.getNumber());
	}
	@Test
	public void doMore()
	{
		Account acc=new Account();
		acc.setBalance(9873.1);acc.setHolder("Sidhukumar");acc.setNumber(8765456789L);
		Account acc1=new Account();
		acc1.setBalance(12600.8);acc1.setHolder("Anbumani");acc1.setNumber(9876567871L);
		Account acc2=new Account();
		acc2.setBalance(12600.8);acc2.setHolder("Anbumani");acc2.setNumber(9876567871L);
		assertNotSame(acc.getBalance(), acc1.getBalance() );
		//assertSame(acc2.getBalance(), acc1.getBalance());
	}
}

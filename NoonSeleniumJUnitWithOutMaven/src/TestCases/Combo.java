package TestCases;

import java.util.Enumeration;
import java.util.Iterator;

import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Combo 
{
	public static void main(String[] args) 
	{
		TestSuite suite=new TestSuite(TestAccount1.class,TestAccount2.class);
		TestResult result=new TestResult();
		suite.run(result);
		System.out.println(result.runCount());
		System.out.println(result.wasSuccessful());
		System.out.println(result.failureCount());
		
		Enumeration<TestFailure> it=result.failures();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement().failedTest().countTestCases());
		}
	}
}

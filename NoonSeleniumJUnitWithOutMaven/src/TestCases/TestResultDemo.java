package TestCases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResultDemo 
{
	public static void main(String[] args) 
	{
		//Result res = JUnitCore.runClasses(TestAccount1.class);
		Result res = JUnitCore.runClasses(TestAccount2.class);
		System.out.println(res.getRunCount()+" tests ran");
		System.out.println(res.getFailureCount()+" getting failed");
		for(Failure fail:res.getFailures())
		{
			System.out.println(fail.getMessage());
		}
	}
}

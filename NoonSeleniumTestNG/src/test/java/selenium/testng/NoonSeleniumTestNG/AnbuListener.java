package selenium.testng.NoonSeleniumTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AnbuListener implements ITestListener
{
	String info="";
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		info=result.getTestName()+"\n";
		System.out.println(info);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		info=result.getMethod()+" getting success \n";
		System.out.println(info);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		info=result.getName()+" getting failed \n";
		System.out.println(info);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		info=result.getMethod()+" getting skipped \n";
		System.out.println(info);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		info=result.getMethod()+" getting failed with success rate \n";
		System.out.println(info);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		info+=result.getMethod()+" getting failed due to time out \n";
		info+=result.getEndMillis()+"\n";
		System.out.println(info);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		info="File Created\n";
		System.out.println(info);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		info="File getting close\n";
		System.out.println(info);
	}
	
}

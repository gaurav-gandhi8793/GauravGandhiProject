package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Sanity test is Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case is Successfully Passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("ScreenShot is Taken for Failed TC");
	}

}

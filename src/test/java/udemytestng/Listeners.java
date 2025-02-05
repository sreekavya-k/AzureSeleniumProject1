package udemytestng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//on beginning of test it starts
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" I succssfully executed listeners "+result.getName());
	}
	            
}

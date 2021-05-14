package com.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listerners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Successfully Failure");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}

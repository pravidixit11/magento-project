package com.magneto.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Reporting implements ITestListener {

		public void onTestStart(ITestResult result) {
		    System.out.println("Test execution startted" +result.getName());
		  }
		  
		public void onTestSuccess(ITestResult result) {
			 System.out.println("Test case is passed  " +result.getName());
		  }

		 	public void onTestFailure(ITestResult result) {
			 System.out.println("Test case is failed" +result.getName());
		  }
		  
		public void onTestSkipped(ITestResult result) {
			  System.out.println("Test case is Skipped " +result.getName());
		  }
		  
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		   
		  }
		  
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }
		
		  public void onStart(ITestContext context) {
			  System.out.println("On start execution ");
		  }
		 
		  public void onFinish(ITestContext context) {
			  System.out.println("On finish execution ");
		  }
}

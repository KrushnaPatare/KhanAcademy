package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started.");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed.");
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takesScreenshot(driver, "KhanAcademy");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Started.");
	}

}

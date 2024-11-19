package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplimentation implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil=new JavaUtility();
	String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" execution started");
		
		test=report.createTest(methodName);
			
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" execution passed");
		
		test.log(Status.PASS,methodName+"execution passed");
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suit execution started");
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(".//Extent Report//Report- "+dateTimeStamp+" .html");
		reporter.config().setDocumentTitle("VTiger Testing Reports");
		reporter.config().setReportName("VTiger");
		reporter.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base OS", "Window");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Reporter Name", "Khurshid");

		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suit execution finished");
		
		report.flush();
		
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" cexcution failed");
		
		test.log(Status.FAIL,methodName+" execution failed");
		
		//capturing the screenshot on test script getting failed
		
		SeleniumUtility sUtil=new SeleniumUtility();
		String screenshotName=methodName+dateTimeStamp;
		//JavaUtility jUtil=new JavaUtility();
		//String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		//String screenshotName=methodName+dateTimeStamp;
		try {
			String path=sUtil.captureScreenshot(BaseClass.sDriver, screenshotName);
			
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" execution skipped");
		
		test.log(Status.SKIP,methodName+" execution skipped");
		
	}
	

}

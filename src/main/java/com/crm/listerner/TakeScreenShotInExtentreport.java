package com.crm.listerner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TakeScreenShotInExtentreport implements ITestListener {
    public ExtentReports reports;
    public ExtentSparkReporter spark;
    public ExtentTest test;
	private TakesScreenshot driver;
    
	
	@Override
	public void onTestStart(ITestResult result) {
		String name= result.getMethod().getMethodName();
		test.log(Status.INFO,"welcome to our class");
		test.log(Status.INFO,"my wonderfull fellows");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "your testcase has passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Your testcase has failed");
		TakesScreenshot ts= (TakesScreenshot) driver;
		String from= ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,"your testcase has skipped");
	}
	@Override
	public void onStart(ITestContext context) {
		File path= new File(".capture.html");
		spark= new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Muje Pata Nahi......");
		spark.config().setTheme(Theme.STANDARD);
		reports= new ExtentReports();
		reports.setSystemInfo("Os","Window-10");
		reports.setSystemInfo("Browser","Chrome");
		reports.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	
}
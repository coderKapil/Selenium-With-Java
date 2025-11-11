package day45;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common information in the report
	public ExtentTest test; //creating test case entries in the report and updates status of the test methods 
	
	public void onStart(ITestContext context) {
	    sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
	    
	    sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
	    sparkReporter.config().setReportName("Functional Testing");//Name of the report
	    sparkReporter.config().setTheme(Theme.STANDARD);
	    
	    extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);
	    
	    extent.setSystemInfo("Computer Name", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester Name", "Kapil");
	    extent.setSystemInfo("OS", "Windows 10");
	    extent.setSystemInfo("Browser Name", "Chrome");
	    
	  }
	
	public void onTestSuccess(ITestResult result) {
	   test = extent.createTest(result.getName());//create a new entry in the report
	   test.log(Status.PASS, "Test case PASSED is:"+result.getName());//updates status pass/fail/skipped
	  }
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case FAILED is:"+result.getName());
		test.log(Status.FAIL,"Test case FAILED is:"+result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.SKIP,"Test case SKIPPED is:"+result.getName());
	  }
//onfinish meth will update the report all the things we have done above will only updated by this meth in report	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
	
	
}

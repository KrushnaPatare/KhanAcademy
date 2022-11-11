package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createExtentReports() {
		
		ExtentReports reports = new ExtentReports();
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("KhanAcademyExtentReport.html");
		
		reports.attachReporter(sparkReporter);
		
		reports.setSystemInfo("Test Type", "Regression Testing");
		
		reports.setSystemInfo("Performed By", "KRUSHNA PATARE");
		
		return reports;
		
	}

}
